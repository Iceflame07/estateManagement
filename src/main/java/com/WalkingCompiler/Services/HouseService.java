package com.WalkingCompiler.Services;
import com.WalkingCompiler.Data.models.House;
import org.springframework.stereotype.Service;

@Service
public interface HouseService {

    House SignUpRequest(String house);
    House loginRequest(String house);
    int generateOTP();
    int OTP();
}
