package com.byteBuilders.Controllers;
import com.byteBuilders.Data.models.Security;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("")
public class SecurityController {

    public static void main(String[] args) {
        SpringApplication.run(SecurityController.class, args);
    }

    @GetMapping("/Security")
    public List<Security> Security() {
        return List.of(
                new Security(
                        "Adamu",
                        10,
                        "Ad@gmail.com"
                )
        );
    }
}
