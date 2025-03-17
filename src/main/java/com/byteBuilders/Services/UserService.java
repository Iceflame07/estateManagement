package com.byteBuilders.Services;
import com.byteBuilders.Data.models.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {

    static List<User> getAllUser() {
        return List.of(
                new User(
                        "George",
                        "George@gmail.com",
                        0
                )
        );
    }
}
