package com.byteBuilders.Controllers;
import com.byteBuilders.DTOs.Request.LoginRequest;
import com.byteBuilders.DTOs.Request.RegisterRequest;
import com.byteBuilders.DTOs.Response.LoginResponse;
import com.byteBuilders.Data.models.House;
import com.byteBuilders.Services.HouseService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/House")
public class HouseController {

    private HouseService houseService;
    private LoginResponse loginResponse;

    @PostMapping("/House")
    public RegisterRequest createAddress(@RequestBody RegisterRequest registerRequest) {
        return houseService.registerHouse(registerRequest);
    }

    @PostMapping("/House")
    public RegisterRequest createNumber(@RequestBody RegisterRequest registerRequest) {
        return houseService.registerHouse(registerRequest);
    }

    @GetMapping("/House")
    public LoginRequest loginAddress(@RequestBody LoginRequest loginRequest) {
        return houseService.loginHouse();
    }

    @GetMapping("/login")
    public LoginRequest loginNumber(@RequestBody LoginRequest loginRequest) {
        return houseService.loginHouse();
    }

    @GetMapping("/login")
    public LoginResponse loginAddress(LoginResponse loginResponse) {
        return houseService.loginResponse("successful");
    }

    @GetMapping("/login")
    public LoginResponse loginNumber(LoginResponse loginResponse) {
        return houseService.loginResponse("successful");
    }

    @GetMapping("/HouseList")
    public List<House> HouseList() {
        return List.of();
    }
}