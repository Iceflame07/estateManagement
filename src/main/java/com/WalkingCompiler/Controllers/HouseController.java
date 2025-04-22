package com.WalkingCompiler.Controllers;
import com.WalkingCompiler.Data.models.House;
import com.WalkingCompiler.Services.HouseService;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@NoArgsConstructor
@RestController
@RequestMapping("/api")
public class HouseController {

    private HouseService houseService;

    @PostMapping("/SignUpRequest")
    public ResponseEntity<House> SignUpRequest(@RequestBody House signUp) {
        House saveSignUp = houseService.SignUpRequest(String.valueOf(signUp));
        return new ResponseEntity<>(saveSignUp, HttpStatus.CREATED);
    }

    @PostMapping("/LoginRequest")
    public ResponseEntity<House> LoginRequest(@RequestBody House login) {
        House saveLogin = houseService.loginRequest(String.valueOf(login));
        return new ResponseEntity<>(saveLogin, HttpStatus.OK);
    }

    @GetMapping("/generateOTP")
    public ResponseEntity<Integer> generatedOTP(@RequestParam int otp) {
        int getOTP = houseService.generateOTP();
        return new ResponseEntity<>(getOTP, HttpStatus.OK);
    }
}