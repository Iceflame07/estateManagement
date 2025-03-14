package com.byteBuilders.Data.repositories;
import com.byteBuilders.Data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository {

    List<User> findAll();
    User findByUsername(String name);
    User findByEmail(String email);
    User findById(int id);

}
