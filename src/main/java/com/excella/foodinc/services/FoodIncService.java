package com.excella.foodinc.services;

import com.excella.foodinc.common.FoodDto;
import reactor.core.publisher.Mono;

public interface FoodIncService {
    Mono<FoodDto>getNutrition(String foodItem);
}
