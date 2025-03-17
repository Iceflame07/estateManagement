package com.byteBuilders.Data.repositories;
import com.byteBuilders.Data.models.House;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HouseRepository extends MongoRepository {

    List<House> FindByAddress(String address);
    List<House> FindByHouseNumber(String houseNumber);
}
