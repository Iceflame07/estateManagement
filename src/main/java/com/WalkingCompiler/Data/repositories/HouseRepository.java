package com.WalkingCompiler.Data.repositories;
import com.WalkingCompiler.Data.models.House;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends MongoRepository<House, String> {

    House findByNumber(String number);
    House findByAddress(String address);
}