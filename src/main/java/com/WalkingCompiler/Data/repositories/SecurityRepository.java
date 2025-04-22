package com.WalkingCompiler.Data.repositories;
import com.WalkingCompiler.Data.models.Security;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends MongoRepository<Security, String> {

    Security findBySecurityName(String securityName);
    Security findBySecurityId(String securityId);
    Security save(String security);

}