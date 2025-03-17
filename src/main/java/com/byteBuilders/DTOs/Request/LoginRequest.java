package com.byteBuilders.DTOs.Request;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class LoginRequest {
    private String userName;
    private int Password;
}
