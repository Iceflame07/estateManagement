package com.byteBuilders.Controllers;
import com.byteBuilders.Data.models.Security;
import com.byteBuilders.Services.SecurityService;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Security")
public class SecurityController {

    public static void main(String[] args) {
        SpringApplication.run(SecurityController.class, args);
    }

    private SecurityService securityService;


    public String SecurityController(SecurityService securityService) {
        this.securityService = securityService;
        return "";
    }

    @GetMapping
    public List<Security> getAllSecurity() {
        return List.of();
    }

}
