package com.excella.foodinc.controllers;

import com.excella.foodinc.common.FoodDto;
import com.excella.foodinc.controllers.controllerInterface.IngredientControllerInterface;
import com.excella.foodinc.services.FoodIncInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
@Slf4j
@Service
public class IngredientController implements IngredientControllerInterface {

    @Autowired
    FoodIncInterface foodIncInterface;
    @GetMapping("/food")
    public Mono<FoodDto> getNutritionData(@RequestParam(value="recipe", required = false) String recipe){
        return foodIncInterface.getNutrition(recipe);// Mono.just(DummyData.foodMap.get(recipe));
    }

}
