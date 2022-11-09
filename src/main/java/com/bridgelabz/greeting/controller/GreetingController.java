package com.bridgelabz.greeting.controller;

import com.bridgelabz.greeting.model.Greeting;
import com.bridgelabz.greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    GreetingService greetingService;
    @PostMapping(value = "/body")
    public Greeting greetingMessages(@RequestBody Greeting greeting){
        return greetingService.printMessages(greeting);
    }
}
