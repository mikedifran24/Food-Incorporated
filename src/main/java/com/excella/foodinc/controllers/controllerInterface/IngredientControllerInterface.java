package com.excella.foodinc.controllers.controllerInterface;

import com.excella.foodinc.common.FoodDto;
import reactor.core.publisher.Mono;

public interface IngredientControllerInterface {

    Mono<FoodDto>getNutritionData(String recipe);
}
