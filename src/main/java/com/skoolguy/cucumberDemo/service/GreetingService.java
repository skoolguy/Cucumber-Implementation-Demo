package com.skoolguy.cucumberDemo.service;

import com.skoolguy.cucumberDemo.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public Greeting greet(String name){
        Greeting greeting = new Greeting();
        greeting.setContent(String.format("Hello %s!", name).toString());
        return greeting;
    }
}
