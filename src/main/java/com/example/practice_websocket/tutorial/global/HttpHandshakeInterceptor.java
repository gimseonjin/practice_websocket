package com.example.practice_websocket.tutorial.global;

import lombok.SneakyThrows;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

public class HttpHandshakeInterceptor implements HandshakeInterceptor {
    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {

        final Logger logger = LoggerFactory.getLogger(this.getClass());

        logger.info("URL : " + request.getRemoteAddress().toString());
        logger.info("Header : " + request.getHeaders().toString());

        return true;
    }

    @SneakyThrows
    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {
    }


}
