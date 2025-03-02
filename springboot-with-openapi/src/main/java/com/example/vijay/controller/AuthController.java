package com.example.vijay.controller;


import com.example.vijay.util.JwtUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil){
        this.jwtUtil=jwtUtil;
    }

    @PostMapping("/login")
    public Map<String,String> login(@RequestParam String username,@RequestParam String password){
        // Dummy check (replace with database authentication)
        if("admin".equals(username) && "password".equals(password)){
            String token=jwtUtil.generateToken(username);

            return Map.of("token",token);
        }
        throw new RuntimeException("Invalid username or password");
    }
}
