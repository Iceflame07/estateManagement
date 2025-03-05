package com.walkingCompiler.Data.models;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalTime;

public class gatePost extends House {

    @Getter @Setter private String securityName;
    @Getter @Setter private String visitorDetails;
    @Getter @Setter private int verifyOTP;
    @Getter @Setter private LocalTime myTime;


    public gatePost(String securityName, String visitorDetails, int verifyOTP, LocalTime myTime) {
        this.securityName = securityName;
        this.visitorDetails = visitorDetails;
        this.verifyOTP = verifyOTP;
        this.myTime = myTime;
    }

    public boolean verifyOTP(String OTP, String providedCode) {
        if (OTP == null) {
            return false;
        } else {
            return true;
        }
    }

}
