package com.web.socket.websocket.controller;

import com.web.socket.websocket.bean.MessageBean;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {

    @MessageMapping("/user-all")
    @SendTo("/topic/user")
    public MessageBean sendToAll(@Payload MessageBean message) {
        return message;
    }


    @MessageMapping("/no-topic")
    @SendTo("")
    public MessageBean sendnotopic(@Payload MessageBean message) {
        return message;
    }


    @MessageMapping("/no-topic2")
    @SendTo("/")
    public MessageBean sendnotopic2(@Payload MessageBean message) {
        return message;
    }

}
