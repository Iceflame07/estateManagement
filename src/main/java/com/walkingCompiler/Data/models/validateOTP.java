package com.walkingCompiler.Data.models;

public class validateOTP {

    private static String OTP;

    public boolean verifyOTP(String OTP, String providedCode) {
        if (OTP == null) {
            return false;
        } else {
            return true;
        }
    }
}
