package com.excella.foodinc;

import reactor.core.publisher.Flux;
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

    @RequestMapping("/recipe")
    public Flux<String> recipe(@RequestParam("name") String name) {
        return Flux.fromIterable(foodIncService.getIngredients(name));
    }

}