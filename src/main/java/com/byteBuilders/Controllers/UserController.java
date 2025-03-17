package com.byteBuilders.Controllers;
import com.byteBuilders.Data.models.User;
import com.byteBuilders.Services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    public static void main(String[] args) {
        SpringApplication.run(UserController.class, args);
    }
    
    private UserService userService;


    public String UserController(UserService userService) {
        this.userService = userService;
        return "";
    }
    
    @GetMapping
    public List<User> getAllUsers() {
        return UserService.getAllUser();
    }
};
