package com.academy.openai.controller;

import com.academy.openai.service.WelcomeService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    //Dependency injection
    private final WelcomeService welcomeService;
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }
}
