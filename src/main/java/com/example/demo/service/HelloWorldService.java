package com.example.demo.service;

import com.example.demo.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    
    @Autowired
    private HelloWorldRepository repository;
    
    public String getHelloWorld() {
        return repository.getHelloMessage() + " world";
    }
    
    public String getHelloWorld(String name) {
        return repository.getHelloMessage(name);
    }
}