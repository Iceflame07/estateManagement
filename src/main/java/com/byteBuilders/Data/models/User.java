package com.byteBuilders.Data.models;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class User extends House{

    @Id
    private String name;
    private int Id;
    private String email;
    private int password;
}
