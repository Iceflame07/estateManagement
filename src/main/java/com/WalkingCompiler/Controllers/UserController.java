package com.WalkingCompiler.Controllers;
import com.WalkingCompiler.Data.models.User;
import com.WalkingCompiler.Services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
@Controller
public class UserController {

    private UserService userService;

    @GetMapping("/UserName")
    public ResponseEntity<User> findByUserName(@RequestBody String username) {
        User saveUserName = userService.findByUserName(username);
        return new ResponseEntity<>(saveUserName, HttpStatus.OK);
    }

    @GetMapping("/UserId")
    public ResponseEntity<User> findByUserId(@RequestBody User userId) {
        User saveUserId = userService.findByUserId(String.valueOf(userId));
        return new ResponseEntity<>(saveUserId, HttpStatus.OK);
    }

    @PostMapping("/findAll")
    public ResponseEntity<User> findAll(@RequestBody User allUsers) {
        User saveAllUsers = userService.findAll(String.valueOf(allUsers));
        return new ResponseEntity<>(saveAllUsers, HttpStatus.OK);
    }

    @PostMapping("/findByUser")
    public ResponseEntity<User> findByUser(@RequestBody User user) {
        User saveUser = userService.findByUser(String.valueOf(user));
        return new ResponseEntity<>(saveUser, HttpStatus.OK);
    }
}
