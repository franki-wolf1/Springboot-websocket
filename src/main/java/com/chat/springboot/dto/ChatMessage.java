package com.chat.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatMessage {
    String message;
    String user;
    String state;

    public String getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String user() {
        return user;
    }

    public ChatMessage setUser(String user) {
        this.user = user;
        return this;
    }
}