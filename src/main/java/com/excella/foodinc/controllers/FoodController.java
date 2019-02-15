package com.excella.foodinc.controllers;

import com.excella.foodinc.domain.FoodNutritionalInformation;
import com.excella.foodinc.model.FoodDto;
import reactor.core.publisher.Mono;

import java.util.List;

public interface FoodController {

    Mono<FoodDto>getNutritionData(String recipe);
    List<FoodNutritionalInformation> getFoodByName(String food);
}
