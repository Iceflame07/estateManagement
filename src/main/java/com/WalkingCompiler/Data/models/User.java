package com.WalkingCompiler.Data.models;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Data
public class User {

    @Id
    private String name;
    private String password;
}
