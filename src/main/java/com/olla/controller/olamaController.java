package com.olla.controller;

import com.olla.service.OlamaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openai/api")
public class olamaController {

    OlamaService olamaService;

    public olamaController(OlamaService olamaService) {
        this.olamaService = olamaService;
    }

    @GetMapping("/chat")
    public String getMessage(@RequestParam String message) {
        return olamaService.chatWithOllama(message);

    }
}
