package com.walkingCompiler.Data.models;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Visitor extends House {

    @Getter @Setter private String visitorName;
    @Getter @Setter private String visitorContact;
    @Getter @Setter private int OTPNumber;
    @Getter @Setter private java.time.LocalTime LocalTime;

    public Visitor(String visitorName, String visitorContact, int OTPNumber, String LocalTime) {
        this.visitorName = visitorName;
        this.visitorContact = visitorContact;
        this.OTPNumber = OTPNumber;
        this.LocalTime = java.time.LocalTime.parse(LocalTime);
    }

    public String getCheckInTime() {
        LocalTime now = LocalTime.now();
        LocalTime = now.plusMinutes(Long.parseLong("05"));
        return now.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public String getCheckOutTime() {
        LocalTime now = LocalTime.now();
        LocalTime = now.plusMinutes(Long.parseLong("05"));
        return now.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public void setFormat(DateTimeFormatter dateTimeFormatter) {
    }
}
