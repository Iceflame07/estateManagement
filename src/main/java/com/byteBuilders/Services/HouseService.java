package com.byteBuilders.Services;
import com.byteBuilders.DTOs.Request.LoginRequest;
import com.byteBuilders.DTOs.Request.LogoutRequest;
import com.byteBuilders.DTOs.Request.RegisterRequest;
import com.byteBuilders.DTOs.Response.LoginResponse;

public interface HouseService {
    public RegisterRequest registerHouse(RegisterRequest registerRequest);
    public LoginRequest loginHouse();
    public LogoutRequest logoutHouse(LogoutRequest logoutRequest, String password);
    public LoginResponse loginResponse(String loginResponse);
}
