package com.example.springjpa.model.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserRequest {
    private String username;
    private String password;

}
