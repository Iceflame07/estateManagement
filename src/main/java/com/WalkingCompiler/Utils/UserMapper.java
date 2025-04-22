package com.WalkingCompiler.Utils;
import com.WalkingCompiler.Data.models.User;
import lombok.Data;

@Data
public class UserMapper {

    public static User mapToLoginRequest(String loginRequest){
        return new User(
                "",
                ""
        );
    }


    public static User mapToSignUpRequest(String signUpRequest){
        return new User(
                "",
                ""
        );
    }

    public static User mapToLoginResponse(String loginResponse){
        return new User(
                "",
                ""
        );
    }

    public static User mapToSignUpResponse(String signUpResponse){
        return new User(
                "",
                ""
        );
    }
}
