package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepository {
    
    public String getHelloMessage() {
        return "hello";
    }
    
    public String getHelloMessage(String name) {
        return "Hello " + name;
    }
}