package com.byteBuilders.Controllers;
import com.byteBuilders.Data.models.User;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
public class UserController {

    private List<User> UserList;

    @GetMapping("/UserList")
    public List findAll(){
        return List.of();
    }

    @PostMapping("/UserList")
    public String addName(@RequestBody User name){
        UserList.add(name);
        return "";
    }

    @PostMapping("/UserList")
    public int addId(@RequestBody User Id){
        UserList.add(Id);
        return 0;
    }

    @PostMapping("/UserList")
    public String addEmail(@RequestBody User email){
        UserList.add(email);
        return "";
    }

    @PostMapping
    public double addPassword(@RequestBody User password){
        UserList.add(password);
        return 0000;
    }

    @PostMapping("/UserList")
    public String deleteUser(@RequestBody User deleteUser){
        UserList.remove(deleteUser);
        return "";
    }
}
