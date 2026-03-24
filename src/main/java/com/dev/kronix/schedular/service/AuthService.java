package com.dev.kronix.schedular.service;

import com.dev.kronix.schedular.entity.User;
import com.dev.kronix.schedular.model.UserRequest;
import com.dev.kronix.schedular.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService  {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository,PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void createUser(UserRequest request){
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        String hashed = passwordEncoder.encode(request.getPassword());
        user.setPassword(hashed);
        user.setUsername(request.getUsername());
        User saved = userRepository.save(user);
    }
}
