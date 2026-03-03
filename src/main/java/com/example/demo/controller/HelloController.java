package com.example.demo.controller;

import com.example.demo.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    private final GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        return greetingService.greet(name);
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}