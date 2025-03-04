package com.walkingCompiler.Data.models;
import lombok.Getter;
import lombok.Setter;

public class Resident {

    @Getter @Setter private String name;
    @Getter @Setter private String contact;
    @Getter @Setter private String address;
    @Getter @Setter private double OTP;

    public Resident(String name, String contact, String address, double OTP) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.OTP = OTP;
    }
}
