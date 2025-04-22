package com.WalkingCompiler.Data.models;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Data
public class Security {

    @Id
    private String Name;
    private String securityId;
    private String Password;
}
