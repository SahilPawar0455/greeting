package com.bridgelabz.greeting.service;

import com.bridgelabz.greeting.model.Greeting;
import com.bridgelabz.greeting.repositary.GreeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {
    @Autowired
    GreeetingRepository greeetingRepository;
    public Greeting printMessages(Greeting greeting){
        return greeetingRepository.save(new Greeting(greeting.getId(),greeting.getName(),greeting.getMessages()));
    }
}
