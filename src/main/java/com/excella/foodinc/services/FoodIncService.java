package com.excella.foodinc.services;

import com.excella.foodinc.models.Food;
import com.excella.foodinc.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public class FoodIncService {

    @Autowired
    private FoodRepository repository;

    public Mono<Food> getFoodInfo(String foodName) {
        return Mono.just(repository.getFoodByName(foodName));
    }

    public Flux<Food> getAllFood() {
        return Flux.fromIterable(repository.findAll());
    }

}