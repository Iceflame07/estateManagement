package com.byteBuilders.Services;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public interface HouseService {

    String createAccount = "";
    int Login = 0;
    Random number = new Random(1001);
    int OTP = number.nextInt(1, 1001);
}
