package com.WalkingCompiler.Services;
import com.WalkingCompiler.Data.models.House;
import com.WalkingCompiler.Data.repositories.HouseRepository;
import com.WalkingCompiler.Utils.HouseMapper;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements HouseService {

    private HouseRepository houseRepository;

    @Override
    public House SignUpRequest(String house) {
        House register = HouseMapper.mapToSignUpRequest(house);
        House savedHouse = houseRepository.save(register);
        return HouseMapper.mapToSignUpRequest(String.valueOf(savedHouse));
    }

    @Override
    public House loginRequest(String house) {
        House house1 = HouseMapper.mapToLoginRequest(house);
        House savedHouse = houseRepository.findByAddress("");
        return HouseMapper.mapToLoginRequest(String.valueOf(savedHouse));
    }

    @Override
    public int generateOTP() {
        House house = (House) HouseMapper.mapToSignUpResponse("OTP");
        House OTP = houseRepository.save(house);
        return HouseMapper.mapToLoginResponse(String.valueOf(OTP)).hashCode();
    }

    @Override
    public int OTP(){
        House house = (House) HouseMapper.mapToSignUpResponse("OTP");
        House OTP = houseRepository.save(house);
        return HouseMapper.mapToSignUpResponse(String.valueOf(OTP)).hashCode();
    }
}