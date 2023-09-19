package com.academy.openai.service.impl;

import com.academy.openai.service.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {
    @Override
    public String sayHi(String name) {
        return "Hello " +name;
    }
}
