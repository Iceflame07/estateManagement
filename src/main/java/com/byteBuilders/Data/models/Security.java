package com.byteBuilders.Data.models;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Security extends User {

    @Id
    private String securityName;
    private int securityId;
    private int securityPassword;

    public Security(String securityName,
                    int securityId,
                    int securityPassword) {

        super(securityName, String.valueOf(securityId), securityPassword);
    }
}
