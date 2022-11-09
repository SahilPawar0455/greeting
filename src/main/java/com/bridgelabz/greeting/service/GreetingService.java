package com.bridgelabz.greeting.service;

import com.bridgelabz.greeting.model.Greeting;
import com.bridgelabz.greeting.repositary.GreeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {
    @Autowired
    GreeetingRepository greeetingRepository;
    public Greeting printMessages(Greeting greeting){
        return greeetingRepository.save(greeting);
    }

    public Optional<Greeting> findGreeting(int id) {
        return greeetingRepository.findById(id);
    }

    public List<Greeting> allGreeting() {
        return greeetingRepository.findAll();
    }

    public Greeting editMessages(int id, String messages) {
        Optional<Greeting> greeting = greeetingRepository.findById(id);
        if (greeting.get().getId() == id){
            greeting.get().setMessages(messages);
            return greeetingRepository.save(greeting.get());
        }else {
            return null;
        }
    }
}
