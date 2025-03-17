package com.byteBuilders.Data.repositories;
import com.byteBuilders.Data.models.House;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends MongoRepository {

    House findByHouseNumber(int HouseNumber);
    House findByHouseAddress(String HouseAddress);
    House save(House address);
    House update(House address);
    void delete(House address);


}
