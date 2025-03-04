package com.walkingCompiler.Data.models;
import lombok.Getter;
import lombok.Setter;

public class Gate {

    @Getter @Setter private String securityName;
    @Getter @Setter private String visitorDetails;
    @Getter @Setter private double visitorOTP;


    public Gate(String securityName, String visitorDetails, double visitorOTP) {
        this.securityName = securityName;
        this.visitorDetails = visitorDetails;
        this.visitorOTP = visitorOTP;
    }

    public void setVisitorOTP(double visitorOTP) {
        this.visitorOTP = 00.1;
    }


}
