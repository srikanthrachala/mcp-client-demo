package com.springcoding.springboot.mcp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatRequest {
    private String userInput;
}
