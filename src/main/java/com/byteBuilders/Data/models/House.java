package com.byteBuilders.Data.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class House {

    @Id
    private String address;
    private int houseNumber;
    private boolean generateOTP;
}
