package com.excella.foodinc.controllers;

import com.excella.foodinc.model.FoodDto;
import reactor.core.publisher.Mono;

public interface FoodController {

    Mono<FoodDto>getNutritionData(String recipe);
}
