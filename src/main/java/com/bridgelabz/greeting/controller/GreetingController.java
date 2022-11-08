package com.bridgelabz.greeting.controller;

import com.bridgelabz.greeting.dto.GreetingDTO;
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
    public String greetingMessages(@RequestBody GreetingDTO greetingDTO){
        return greetingService.printMessages(greetingDTO);
    }
}
