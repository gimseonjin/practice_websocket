package com.example.practice_websocket.tutorial.global;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageChannerInterceptor implements ChannelInterceptor {
    @Override
    public Message preSend(Message<?> message, MessageChannel channel) {

        final Logger logger = LoggerFactory.getLogger(this.getClass());

        StompHeaderAccessor accessor = StompHeaderAccessor.wrap(message);

        logger.info(accessor.toString());

        return message;
    }
}
