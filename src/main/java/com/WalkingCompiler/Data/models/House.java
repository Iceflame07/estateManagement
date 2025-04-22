package com.WalkingCompiler.Data.models;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Data
public class House {

    @Id
    private String address;
    private String number;
    private boolean generateOTP;
}
