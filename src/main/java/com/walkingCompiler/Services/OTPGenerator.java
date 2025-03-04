package com.walkingCompiler.Services;
import lombok.Getter;
import lombok.Setter;
import java.util.Random;

public class OTPGenerator {

    @Getter @Setter int number;

    public int generateRandomOTP() {
        Random number = new Random();
        int OTP = number.nextInt(1, 10);
        return OTP;
    }

    public int getNumber() {
        return number;
    }
}
