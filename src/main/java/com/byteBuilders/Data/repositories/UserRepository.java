package com.byteBuilders.Data.repositories;
import com.byteBuilders.Data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository {

    User findByName(String name);
    User findByEmail(String email);
    User findByPassword(int password);

}
