package com.WalkingCompiler.Services;
import com.WalkingCompiler.Data.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findByUserName(String userName);
    User findByUser(String user);
    User findAll(String allUsers);
    User findByUserId(String userId);
}

