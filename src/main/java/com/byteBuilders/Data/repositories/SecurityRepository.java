package com.byteBuilders.Data.repositories;
import com.byteBuilders.Data.models.Security;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends MongoRepository<Security, String> {

    Security findByName(String securityName);
    Security findById(int Id);

}
