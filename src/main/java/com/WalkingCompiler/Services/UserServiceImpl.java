package com.WalkingCompiler.Services;
import com.WalkingCompiler.Data.models.User;
import com.WalkingCompiler.Data.repositories.UserRepository;
import com.WalkingCompiler.Utils.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User findByUserName(String username) {
        User user = UserMapper.mapToLoginRequest(String.valueOf(username));
        User savedUserName = userRepository.save(user);
        return userRepository.save(savedUserName);
    }

    @Override
    public User findByUser(String user){
      User user1 = UserMapper.mapToSignUpRequest(user);
      User savedUser = userRepository.save(user1);
      return userRepository.save(savedUser);
    }

    @Override
    public User findAll(String allUsers){
        User users = UserMapper.mapToSignUpResponse(allUsers);
        User savedUsers = userRepository.save(users);
        return userRepository.save(savedUsers);
    }

    @Override
    public User findByUserId(String userId){
        User user1 = UserMapper.mapToLoginResponse("1");
        User savedUserId = userRepository.save(user1);
        return userRepository.save(savedUserId);
    }
}
