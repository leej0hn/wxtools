package com.redscarf.wxtools.websocket.configuration;

import com.redscarf.wxtools.websocket.socket.WxToolsMessageHandler;
import com.redscarf.wxtools.websocket.socket.WxToolsWebSocket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
import org.springframework.web.socket.server.standard.ServerEndpointRegistration;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/9/12
 * <p>Version: 1.0
 */
@Slf4j
@Configuration
public class WebSocketConfig {

    @Value("${application.websocket.path}")
    private String applicationWebsocketPath;
    @Value("${application.websocket.token}")
    private String applicationWebsocketToken;

    @Bean
    public ServerEndpointExporter serverEndpointExporter (){
        return new ServerEndpointExporter();
    }

    @Bean
    public ServerEndpointRegistration wechatWebSocketSingleton() {
        log.info("applicationWebsocketPath : " + applicationWebsocketPath + " ; applicationWebsocketToken : " + applicationWebsocketToken);
        return new ServerEndpointRegistration(applicationWebsocketPath, new WxToolsWebSocket(messageHandlerSingleton(),applicationWebsocketToken));
    }

    @Bean
    public WxToolsMessageHandler messageHandlerSingleton(){
        return new WxToolsMessageHandler();
    }
}
