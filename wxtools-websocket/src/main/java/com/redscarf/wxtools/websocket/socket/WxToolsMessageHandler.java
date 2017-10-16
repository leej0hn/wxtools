package com.redscarf.wxtools.websocket.socket;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Throwables;
import com.redscarf.wxtools.common.android.contants.ApiCodes;
import com.redscarf.wxtools.common.android.dto.WechatMsg;
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
        try {
            if (message == null || message.equals("")) {
                return;
            }
            WechatMsg wechatMsg = JSON.parseObject(message, WechatMsg.class);
            String apiCode = wechatMsg.getApiCode();
            if ( !ApiCodes.SERVER_HEARTBEAT_API_CODE.equals(apiCode) ) {
                log.info("来自客户端的消息:" + message);
            }
            switch (apiCode) {
                //微信消息
                case ApiCodes.WECHAT_MESSAGE_API_CODE :
                    break;
                //群信息更新
                case ApiCodes.WECHAT_CHATROOM_REFRESH_API_CODE :
                    break;
                //联系人更新
                case ApiCodes.WECHAT_CONTACT_REFRESH_API_CODE :
                    break;
                //联系人头像更新
                case ApiCodes.WECHAT_CONTACT_IMG_REFRESH_API_CODE :
                    break;
                default :
                    break;
            }
        }catch (Exception e){
            log.error(Throwables.getStackTraceAsString(e));
        }
    }

}
