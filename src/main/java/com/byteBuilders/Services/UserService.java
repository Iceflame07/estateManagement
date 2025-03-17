package com.byteBuilders.Services;
import com.byteBuilders.DTOs.Request.LoginRequest;
import com.byteBuilders.DTOs.Request.RegisterRequest;

public interface UserService {

    public String registerUser(RegisterRequest registerRequest);
    public String loginUser(LoginRequest loginRequest);
}
