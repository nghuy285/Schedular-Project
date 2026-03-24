package com.dev.kronix.schedular.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRequest {
    private String name;
    private String username;
    private String email;
    private String password;
}
