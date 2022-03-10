package com.tutorial.praneethpj.tutorial.controller;


import com.tutorial.praneethpj.tutorial.model.User;
import com.tutorial.praneethpj.tutorial.payload.LoginRequest;
import com.tutorial.praneethpj.tutorial.payload.SignUpRequest;
import com.tutorial.praneethpj.tutorial.repository.UserRepository;
import com.tutorial.praneethpj.tutorial.security.JwtTokenProvider;
import com.tutorial.praneethpj.tutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenProvider tokenProvider;

    @Autowired
    UserService userService;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
    String token=userService.signIn(loginRequest.getUsernameOrEmail(), loginRequest.getPassword());

    if(token.length()>0) {
        return ResponseEntity.ok().body(token);
    }else{
        return ResponseEntity.ok().body("Username or password is invalid");
    }
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {

        User user=userService.signupUser(signUpRequest.getUsernameOrEmail(), signUpRequest.getPassword());

        if(user!=null) {
            return ResponseEntity.ok("A new user created");
        }else{
            return ResponseEntity.ok("Cannot create a user");
        }
    }




}