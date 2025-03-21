package com.byteBuilders.Data.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Security extends User{

    @Id
    private String Name;
    private int Id;
    private int Password;
}
