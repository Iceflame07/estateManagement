package com.byteBuilders.Controllers;
import com.byteBuilders.Data.models.House;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("")
public class HouseController {

    public static void main(String[] args) {
        SpringApplication.run(HouseController.class, args);
    }

    @GetMapping("/HouseList")
    public List<House> House() {
        return List.of(
                new House (
                        "Herbert Street",
                        12,
                        1001
                )
        );
    }
}
