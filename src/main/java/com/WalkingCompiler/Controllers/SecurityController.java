package com.WalkingCompiler.Controllers;
import com.WalkingCompiler.Data.models.Security;
import com.WalkingCompiler.Services.SecurityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@Controller
public class SecurityController {

    private SecurityService securityService;

    @PostMapping("/findByUsername")
    public ResponseEntity<Security> findByUsername(@RequestBody Security username) {
        Security savedUsername = securityService.findByUsername(String.valueOf(username));
        return new ResponseEntity<>(savedUsername, HttpStatus.OK);
    }

    @PostMapping("/findBySecurityId")
    public ResponseEntity<Security> findBySecurityId(@RequestBody Security securityId) {
        Security savedSecurityId = securityService.findBySecurityId(String.valueOf(securityId));
        return new ResponseEntity<>(savedSecurityId, HttpStatus.OK);
    }

    @GetMapping("/otp")
    public ResponseEntity<Security> generatedOTP(@RequestParam Security otp) {
        Security generatedOTP = securityService.generatedOTP(true);
        return new ResponseEntity<>(generatedOTP, HttpStatus.OK);
    }
}
