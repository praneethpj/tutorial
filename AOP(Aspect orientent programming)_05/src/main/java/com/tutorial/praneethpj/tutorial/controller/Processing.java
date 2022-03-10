package com.tutorial.praneethpj.tutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Praneethpj
 */
@RestController
@RequestMapping("/api/processing")
public class Processing {

    @GetMapping("/calc")
    public ResponseEntity<?> calc(){
        return ResponseEntity.ok("calc");
    }
}
