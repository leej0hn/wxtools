package com.redscarf.wxtools.websocket.configuration;

import com.redscarf.wxtools.websocket.socket.WxToolsMessageHandler;
import com.redscarf.wxtools.websocket.socket.WxToolsWebSocket;
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
@Configuration
public class WebSocketConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter (){
        return new ServerEndpointExporter();
    }

    @Bean
    public ServerEndpointRegistration wechatWebSocketSingleton() {
        return new ServerEndpointRegistration("/websocket-input", new WxToolsWebSocket(messageHandlerSingleton()));
    }

    @Bean
    public WxToolsMessageHandler messageHandlerSingleton(){
        return new WxToolsMessageHandler();
    }
}
