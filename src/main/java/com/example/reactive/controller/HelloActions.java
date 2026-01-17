package com.example.reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloActions {
    

    @GetMapping("/hello")
    public String hello() {
        log.info("Hello endpoint called");
        return "Hello, Github Actions!!";
    }

}
