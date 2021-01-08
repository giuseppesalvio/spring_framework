package com.salvio.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final String greeting;

    public GreetingService(String greeting) {
        super();
        this.greeting = greeting;
    }

    public String getGreeting(String name) {
        return greeting + " " + name;
    }
}
