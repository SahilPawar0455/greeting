package com.bridgelabz.greeting.model;

import com.bridgelabz.greeting.dto.GreetingDTO;

public class Greeting {
    private int id;
    private String name;
    private String messages;

    public Greeting(GreetingDTO greetingDTO) {
        this.id = greetingDTO.getId();
        this.name = greetingDTO.getName();
        this.messages = greetingDTO.getMessages();
    }
}
