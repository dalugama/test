package com.example.demo.controller;

import com.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class HelloWorldController {
    
    @Autowired
    private HelloWorldService service;
    
    @GetMapping("/hello")
    public Map<String, String> hello(@RequestParam(required = false) String name) {
        String message = (name != null) ? service.getHelloWorld(name) : service.getHelloWorld();
        Map<String, String> response = new HashMap<>();
        response.put("message", message);
        return response;
    }
}