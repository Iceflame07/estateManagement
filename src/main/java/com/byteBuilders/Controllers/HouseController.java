package com.byteBuilders.Controllers;
import com.byteBuilders.Data.models.House;
import com.byteBuilders.Services.HouseService;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/House")
public class HouseController {

    public static void main(String[] args) {
        SpringApplication.run(HouseController.class, args);
    }

    private HouseService houseService;

    public String HouseController(HouseService houseService) {
        this.houseService = houseService;
        return "";
    }

    @GetMapping("/HouseList")
    public List<House> HouseList() {
        return HouseService.getAllHouses();
    }

}
