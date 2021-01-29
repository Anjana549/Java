package com.elementsgs.boilerplate.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class WelcomeController {

    @GetMapping("test")
    public ResponseEntity<String> mainMethod() {
        return ResponseEntity.ok().body("Hello world");
    }
}