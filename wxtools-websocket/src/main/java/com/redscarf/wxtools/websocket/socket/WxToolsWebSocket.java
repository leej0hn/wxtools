package com.redscarf.wxtools.websocket.socket;

import com.google.common.base.Throwables;
import com.redscarf.wxtools.websocket.utils.WebsocketUtil;
import lombok.extern.slf4j.Slf4j;

import javax.websocket.CloseReason;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.util.List;
import java.util.Map;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/9/12
 * <p>Version: 1.0
 */
@Slf4j
public class WxToolsWebSocket extends Endpoint{

    private final WxToolsMessageHandler testMessageHandler;

    public WxToolsWebSocket(WxToolsMessageHandler testMessageHandler){
        this.testMessageHandler = testMessageHandler;
        log.info("TestWebSocket hashcode : " + this.hashCode());
    }

    @Override
    public void onOpen (Session session ,EndpointConfig endpointConfig){
        try {
            Map<String, List<String>> requestParameterMap = session.getRequestParameterMap();
            List<String> tokenList = requestParameterMap.get("token");
            List<String> clientWxIdList = requestParameterMap.get("clientWxId");
            String clientWxId = null ;
            if( tokenList != null  ){
                String token = tokenList.get(0);
                if( token != null && token.equals("b53a132adb7294e7c71771e60b4eaabe") ){
                    if( clientWxIdList != null ){
                        clientWxId = clientWxIdList.get(0);
                    }
                    if( clientWxId != null && !clientWxId.equals("")){
                        WebsocketUtil.put(clientWxId,session);
                        session.addMessageHandler(testMessageHandler);
                        log.info("TestWebSocket onOpen hashcode : " + this.hashCode() + "  sessionId : " + session.getId() +  " clientWxId : " + clientWxId + "   有新链接加入 !  ; 当前在线人数为" + WebsocketUtil.size());
                        return;
                    }
                }
            }
            session.close();
        }catch (Exception e){
            log.error(Throwables.getStackTraceAsString(e));
        }
    }

    @Override
    public void onClose (Session session,CloseReason closeReason){
        String clientWxId = WebsocketUtil.remove(session);
        log.info("sessionId : " + session.getId() + "  clientWxId : " + clientWxId + "  有一链接关闭!当前在线人数为" + WebsocketUtil.size());
    }



}