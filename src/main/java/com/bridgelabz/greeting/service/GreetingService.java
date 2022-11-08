package com.bridgelabz.greeting.service;

import com.bridgelabz.greeting.dto.GreetingDTO;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String printMessages(GreetingDTO greetingDTO){
        return greetingDTO.toString();
    }
}
