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
    private String securityPassword;

    public Security(String name, int Id, String password) {
        super(name, Id, password);
    }

    private int Password;

}
