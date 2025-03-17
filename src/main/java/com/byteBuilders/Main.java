package com.byteBuilders;
import com.byteBuilders.Controllers.HouseController;
import com.byteBuilders.Controllers.SecurityController;
import com.byteBuilders.Controllers.UserController;
import org.springframework.boot.SpringApplication;

public class Main {

    public static void main(String[] args) {
        SpringApplication.run(HouseController.class, args);
        SpringApplication.run(SecurityController.class, args);
        SpringApplication.run(UserController.class, args);
    }
}