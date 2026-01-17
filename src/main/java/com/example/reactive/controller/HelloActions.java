package com.example.reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloActions {
    

    @GetMapping("/")
    public String helloActions() {
        return "Hello, Github Actions!!";
    }

}
