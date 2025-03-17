package com.byteBuilders.Data.repositories;
import com.byteBuilders.Data.models.Security;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecurityRepository extends MongoRepository<Security, String> {

    List<Security> findByName(String name);
    List<Security> findById(int id);
    List<Security> findByEmail(String email);
}
