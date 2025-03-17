package com.byteBuilders.Data.models;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class User extends House{

    @Id
    private String name;
    private String email;
    private double password;

    public User(String name,
                int email,
                String password) {

        super(name, Integer.parseInt(email), password);

        this.name = name;
        this.email = email;
        this.password = password;
    }
}
