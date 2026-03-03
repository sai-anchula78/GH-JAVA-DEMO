package com.example.demo;

import com.example.demo.service.GreetingService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    private final GreetingService greetingService = new GreetingService();

    @Test
    void greetWithName() {
        String result = greetingService.greet("Anudeep");
        assertEquals("Hello, Anudeep!", result);
    }

    @Test
    void greetWithoutName() {
        String result = greetingService.greet("");
        assertEquals("Hello, World!", result);
    }
}