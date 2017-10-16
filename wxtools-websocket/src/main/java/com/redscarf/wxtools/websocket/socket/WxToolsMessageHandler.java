package com.redscarf.wxtools.websocket.socket;

import com.alibaba.fastjson.JSON;
import com.redscarf.wxtools.utils.Base64Util;
import com.redscarf.wxtools.websocket.dto.WechatMsg;
import com.redscarf.wxtools.websocket.utils.WebsocketUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.MessageHandler;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/9/14
 * <p>Version: 1.0
 */
@Slf4j
@Component
public class WxToolsMessageHandler implements MessageHandler.Whole<String> {

    @Override
    public void onMessage(String message) {
        WechatMsg wechatMsg = JSON.parseObject(message, WechatMsg.class);
        if( !wechatMsg.getApiCode().equals("9999")){
            log.info("TestMessageHandler hash : " + this.hashCode() + "  testService hashcode : " +  " 当前在线人数为" + WebsocketUtil.size() + "  来自客户端的消息:" + message);
        }
        Base64Util.decoderBase64File(wechatMsg.getFile(),"E:\\file.jpg");
    }

}
