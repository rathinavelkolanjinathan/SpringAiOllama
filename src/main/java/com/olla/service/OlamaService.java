package com.olla.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OlamaService {
   private final ChatClient client;
    public OlamaService(ChatClient.Builder clientBuilder) {
        this.client = clientBuilder.build();
    }


    public String chatWithOllama(String prompt) {

        return client.prompt(prompt)
                .call()
                .content();

    }
}
