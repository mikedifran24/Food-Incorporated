package com.excella.foodinc;

import com.excella.foodinc.models.DummyData;
import com.excella.foodinc.models.FoodDTO;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FoodIncController {

    private FoodIncService foodIncService;

    FoodIncController() {
        foodIncService = new FoodIncService();
    }

    @RequestMapping("/demo")
    public Mono<String> demo() {
        return Mono.just("Hello World!");
    }

    @RequestMapping("/food")
    public Mono<FoodDTO> getFood(@RequestParam("name") String name) {
        return foodIncService.getFoodInfo(name);
    }

}