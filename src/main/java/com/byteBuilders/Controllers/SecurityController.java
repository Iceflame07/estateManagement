package com.byteBuilders.Controllers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class SecurityController {

    @GetMapping("/Security")
    public String Security(@RequestBody String securityName) {
        return securityName;
    }

    @PostMapping("/Security")
    public int addId(@RequestBody int securityId) {
        return securityId;
    }

    @PostMapping("/Security")
    public int addPassword(@RequestBody int security) {
        return security;
    }
}
