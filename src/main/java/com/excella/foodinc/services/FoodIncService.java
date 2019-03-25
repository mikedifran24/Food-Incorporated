package com.excella.foodinc.services;

import com.excella.foodinc.models.DummyData;
import com.excella.foodinc.DTO.FoodDTO;
import reactor.core.publisher.Mono;

public class FoodIncService {

    public Mono<FoodDTO> getFoodInfo(String recipeName) {
        return Mono.just(DummyData.map.get(recipeName));
    }

}