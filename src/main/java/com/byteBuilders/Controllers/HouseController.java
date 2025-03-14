package com.byteBuilders.Controllers;
import com.byteBuilders.Data.models.House;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
public class HouseController {

    private List<House> HouseList;

    @GetMapping("/HouseList")
    public List findAll(){
        return List.of();
    }

    @PostMapping("/HouseList")
    public String addHouse(House address){
        HouseList.add(address);
        return "";
    }

    @PostMapping("/HouseList")
    public int addNumber(House number){
        HouseList.add(number);
        return 0;
    }

    @PostMapping("/HouseList")
    public String updateHouse(House address){
        HouseList.remove(address);
        return "";
    }
}
