package com.WalkingCompiler.Services;
import com.WalkingCompiler.Data.models.Security;
import org.springframework.stereotype.Service;

@Service
public interface SecurityService {

    Security findByUsername(String username);
    Security findBySecurityId(String securityId);
    Security generatedOTP(boolean otp);
}
