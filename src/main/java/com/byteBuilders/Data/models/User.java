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
    private int password;

    public User(String name,
                String email,
                int password) {

        super(name, Integer.parseInt(email), password);

        this.name = name;
        this.email = email;
        this.password = password;
    }
}
