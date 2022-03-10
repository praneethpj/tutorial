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
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Praneethpj
 */
@RestController
@RequestMapping("/api/dashboard")
public class DahboardController {




    @GetMapping("/userDashboard")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> userDashboard(){
        return ResponseEntity.ok("Hi user, You have allowed to access");
    }

    @GetMapping("/adminDashboard")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> adminDashboard(){
        return ResponseEntity.ok("Hi admin, You have allowed to access");
    }
}
