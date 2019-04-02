package com.excella.foodinc.controllers;

import com.excella.foodinc.DTO.FoodDTO;
import com.excella.foodinc.models.Food;
import com.excella.foodinc.services.FoodIncService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FoodIncController {

    @Autowired
    private FoodIncService foodIncService;

    @RequestMapping("/demo")
    public Mono<String> demo() {
        return Mono.just("Hello World!");
    }

    @RequestMapping("/food")
    public Mono<Food> getFood(@RequestParam("name") String name) {
        return foodIncService.getFoodInfo(name);
    }

    @RequestMapping("/all")
    public Flux<Food> getAllFood() {
        return foodIncService.getAllFood();
    }

}