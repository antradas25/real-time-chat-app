package com.chat.app.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatMessage {
    private Long id;
    private String Sender;
    private String content;
}
