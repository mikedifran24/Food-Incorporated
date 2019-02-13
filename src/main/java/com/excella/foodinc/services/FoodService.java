package com.excella.foodinc.services;

import com.excella.foodinc.model.FoodDto;
import reactor.core.publisher.Mono;

public interface FoodService {
    Mono<FoodDto>getNutrition(String foodItem);
}
