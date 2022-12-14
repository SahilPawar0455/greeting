package com.bridgelabz.greeting.controller;

import com.bridgelabz.greeting.model.Greeting;
import com.bridgelabz.greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GreetingController {
    @Autowired
    GreetingService greetingService;
    @PostMapping(value = "/body")
    public Greeting greetingMessages(@RequestBody Greeting greeting){
        return greetingService.printMessages(greeting);
    }

    @GetMapping("/getMessage/{id}")
    public Optional<Greeting> findGreeting(@PathVariable int id){
        return greetingService.findGreeting(id);
    }

    @GetMapping(value = "/allGreeting")
    public List<Greeting> allGreeting(){
        return greetingService.allGreeting();
    }

    @PutMapping(value = "/update/{id}")
    public Greeting editMessages(@PathVariable int id,
                                 @RequestParam(value = "messages") String messages){
        return (greetingService.editMessages(id, messages));
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteGreeting(@PathVariable int id){
        greetingService.deleteGreeting(id);
    }
}
