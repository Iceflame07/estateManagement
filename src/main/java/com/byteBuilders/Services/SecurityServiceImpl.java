package com.byteBuilders.Services;
import com.byteBuilders.DTOs.Request.LoginRequest;
import com.byteBuilders.DTOs.Request.LogoutRequest;
import com.byteBuilders.DTOs.Request.RegisterRequest;

public class SecurityServiceImpl implements SecurityService {

    @Override
    public RegisterRequest registerSecurity(RegisterRequest registerRequest) {
        return registerRequest;
    }

    @Override
    public LoginRequest loginSecurity(LoginRequest loginRequest) {
        return loginRequest;
    }

    @Override
    public LogoutRequest logOutSecurity(LogoutRequest logoutRequest, String password) {
        return logoutRequest;
    }
}
