package com.byteBuilders.Services;
import com.byteBuilders.Data.models.House;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface HouseService {

    static List<House> getAllHouses() {
        return List.of(
                new House (
                        "Herbert Street",
                        12,
                        1001
                )
        );
    }
}
