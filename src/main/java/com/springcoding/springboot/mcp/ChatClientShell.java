package com.springcoding.springboot.mcp;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
@RequiredArgsConstructor
public class ChatClientShell {

    private final ChatClient chatClient;

    @ShellMethod(key = "chat")
    public String interactiveChat(@ShellOption(defaultValue = "Hello MCP Client!") String question) {
       return chatClient.prompt(question).call().content();
    }
}

