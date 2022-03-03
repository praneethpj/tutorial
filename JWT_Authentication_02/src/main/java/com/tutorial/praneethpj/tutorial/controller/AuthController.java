package com.tutorial.praneethpj.tutorial.controller;

import com.tutorial.praneethpj.tutorial.model.User;
import com.tutorial.praneethpj.tutorial.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Praneethpj
 */

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody User requestuser) {
        UserService userservice =new UserService();
        userservice.signupUser(requestuser.getUsername(),requestuser.getPassword());
        return ResponseEntity.ok().body(userservice);
    }



}
