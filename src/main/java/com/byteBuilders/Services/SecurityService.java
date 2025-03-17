package com.byteBuilders.Services;
import com.byteBuilders.DTOs.Request.LoginRequest;
import com.byteBuilders.DTOs.Request.LogoutRequest;
import com.byteBuilders.DTOs.Request.RegisterRequest;

public interface SecurityService {
    public RegisterRequest registerSecurity(RegisterRequest registerRequest);
    public LoginRequest loginSecurity(LoginRequest loginRequest);
    public LogoutRequest logOutSecurity(LogoutRequest logoutRequest, String password);
}
