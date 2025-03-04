package com.walkingCompiler.Data.models;
import lombok.Getter;
import lombok.Setter;

public class Visitor {

    @Getter @Setter private String visitorName;
    @Getter @Setter private String visitorNumber;
    @Getter @Setter private String visitorAddress;

    public Visitor(String visitorName, String visitorNumber, String visitorAddress) {
        this.visitorName = visitorName;
        this.visitorNumber = visitorNumber;
        this.visitorAddress = visitorAddress;
    }
}
