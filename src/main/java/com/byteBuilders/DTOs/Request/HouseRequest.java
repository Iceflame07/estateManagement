package com.byteBuilders.DTOs.Request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HouseRequest {

    private int number;
    private String address;
    private int generateOTP;
}
