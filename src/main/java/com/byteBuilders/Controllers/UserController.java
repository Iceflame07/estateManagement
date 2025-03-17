package com.byteBuilders.Controllers;
import com.byteBuilders.Data.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("")
public class UserController {

    public List<User> UserList;

    public static void main(String[] args) {
        SpringApplication.run(UserController.class, args);
    }

    @GetMapping("/UserList")
    public List<User> UserList() {
        return List.of(
                new User(
                        "George",
                        "George@gmail.com",
                        0000
                )
        );
    }
};
