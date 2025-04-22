package com.WalkingCompiler.DTOs.Request;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRequest {


    private String userName;
    private int Password;
}
