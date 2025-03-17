package com.byteBuilders.Controllers;
import com.byteBuilders.DTOs.Request.LoginRequest;
import com.byteBuilders.DTOs.Request.RegisterRequest;
import com.byteBuilders.Data.models.Security;
import com.byteBuilders.Services.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Security")
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    @PostMapping
    public RegisterRequest createName(@RequestBody RegisterRequest registerRequest) {
        return securityService.registerSecurity(registerRequest);
    }

    @PostMapping
    public RegisterRequest createId(@RequestBody RegisterRequest registerRequest) {
        return securityService.registerSecurity(registerRequest);
    }

    @PostMapping
    public RegisterRequest createPassword(@RequestBody RegisterRequest registerRequest) {
        return securityService.registerSecurity(registerRequest);
    }

    @GetMapping
    public LoginRequest getName(@RequestParam LoginRequest LoginRequest) {
        return securityService.loginSecurity(LoginRequest);
    }

    @GetMapping
    public LoginRequest getId(@RequestParam LoginRequest LoginRequest) {
        return securityService.loginSecurity(LoginRequest);
    }

    @GetMapping
    public LoginRequest getPassword(@RequestParam LoginRequest LoginRequest) {
        return securityService.loginSecurity(LoginRequest);
    }

    @GetMapping
    public List<Security> getAllSecurity() {
        return List.of();
    }
}
