package com.test.proj.dto;

import lombok.Data;

@Data
public class SignInRequest {
    private String username;
    private String email;
    private String password;
}
