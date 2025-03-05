package com.walkingCompiler.Data.models;
import lombok.Getter;
import lombok.Setter;
import java.util.Random;

public class House {

    @Getter @Setter private String address;
    @Getter @Setter private int OTPGenerator;

    public House(String address, int OTPGenerator) {
        this.address = address;
        this.OTPGenerator = OTPGenerator;
    }

    public House() {

    }

    public int generateRandomOTP() {
        Random number = new Random();
        int OTP = number.nextInt(1, 10);
        return OTP;
    }
}
