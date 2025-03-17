package com.byteBuilders.DTOs.Request;

import lombok.Data;

@Data
public class SecurityRequest {

    private String securityName;
    private String securityPassword;
    private int securityId;
}
