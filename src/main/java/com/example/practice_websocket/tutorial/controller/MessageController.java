package com.example.practice_websocket.tutorial.controller;

import com.example.practice_websocket.tutorial.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {


    @MessageMapping("/message")
    @SendTo("/topic/message")
    public Message greeting(Message message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Message(HtmlUtils.htmlEscape(message.getContent()));
    }

}