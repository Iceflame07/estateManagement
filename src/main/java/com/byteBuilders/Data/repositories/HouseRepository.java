package com.byteBuilders.Data.repositories;
import com.byteBuilders.Data.models.House;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends MongoRepository<House, String> {

    House findByNumber(int Number);
    House findByAddress(String Address);
}