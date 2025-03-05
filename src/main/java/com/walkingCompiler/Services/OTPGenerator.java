package com.walkingCompiler.Services;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class OTPGenerator {

    @Getter @Setter private int number;
    @Getter @Setter private LocalTime myTime;
    @Getter @Setter private String checkInTime;
    @Getter @Setter private String checkOutTime;

    public int generateRandomOTP() {
        Random number = new Random();
        int OTP = number.nextInt(1, 10);
        return OTP;
    }

    public String getCheckInTime() {
        LocalTime now = LocalTime.now();
        return now.format(DateTimeFormatter.ofPattern(""));
    }

    public String getCheckOutTime() {
        LocalTime now = LocalTime.now();
        now = now.plusMinutes(05);
        return now.format(DateTimeFormatter.ofPattern(""));
    }
}
