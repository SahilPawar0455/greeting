package com.bridgelabz.greeting.controller;

import com.bridgelabz.greeting.model.Greeting;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @PostMapping(value = "/body")
    public String greetingMessages(@RequestBody Greeting greeting){
        return greeting.getId()+" "+greeting.getName()+" "+greeting.getMessages();
    }
}
