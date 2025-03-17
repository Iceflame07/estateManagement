package com.byteBuilders.Controllers;
import com.byteBuilders.DTOs.Request.LoginRequest;
import com.byteBuilders.DTOs.Request.RegisterRequest;
import com.byteBuilders.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String createName(@RequestBody RegisterRequest registerRequest) {
        return userService.registerUser(registerRequest);
    }
    @PostMapping
    public String createPassword(@RequestBody RegisterRequest registerRequest) {
        return userService.registerUser(registerRequest);
    }

    @GetMapping
    public String LoginName(@RequestBody LoginRequest loginRequest) {
        return userService.loginUser(loginRequest);
    }

    @GetMapping
    public String LoginPassword(@RequestBody LoginRequest loginRequest) {
        return userService.loginUser(loginRequest);
    }
};
