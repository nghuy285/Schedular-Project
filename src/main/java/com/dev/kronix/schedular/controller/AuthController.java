package com.dev.kronix.schedular.controller;

import com.dev.kronix.schedular.model.UserRequest;
import com.dev.kronix.schedular.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService service;
    public AuthController(AuthService serivce){
        this.service = serivce;
    }
    @PostMapping("/reigster")
    public void register(@RequestBody UserRequest request){
        service.createUser(request);
    }
}
