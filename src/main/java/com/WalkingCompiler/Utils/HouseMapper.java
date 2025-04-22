package com.WalkingCompiler.Utils;
import com.WalkingCompiler.Data.models.House;
import com.WalkingCompiler.Services.HouseService;
import lombok.Data;


@Data
public class HouseMapper {

        public static House mapToLoginRequest(String HouseService) {
                return new House(
                        "",
                        "",
                        true
                );
        }

        public static House mapToSignUpRequest(String HouseService) {
                return new House(
                        "",
                        "",
                        true
                );
        }

        public static HouseService mapToLoginResponse(String house) {
                return (HouseService) new House(
                        "",
                        "",
                        true
                );
        }

        public static HouseService mapToSignUpResponse(String house) {
                return (HouseService) new House(
                        "",
                        "",
                        true
                );
        }
}

