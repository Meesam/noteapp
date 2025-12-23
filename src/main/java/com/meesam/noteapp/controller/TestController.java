package com.meesam.noteapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> test(){
      return ResponseEntity.ok("Spring Boot is working fine");
    }
}
