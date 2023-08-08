package com.example.chatandsocket.controller;

import com.example.chatandsocket.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatMessageController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public ChatMessage getChatMessage(ChatMessage chatMessage) {
        return chatMessage;
    }
}
