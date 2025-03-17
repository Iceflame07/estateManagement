package com.byteBuilders.Data.models;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class House {

    @Id
    private String address;
    private int houseNumber;
    private int generateOTP;


    public House(String address,
                 int houseNumber,
                 double generateOTP) {

        this.address = address;
        this.houseNumber = houseNumber;
        this.generateOTP = (int) generateOTP;
    }
}
