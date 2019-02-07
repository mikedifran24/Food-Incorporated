package com.excella.foodinc.controllers;

import com.excella.foodinc.common.FoodDto;
import com.excella.foodinc.controllers.controllerInterface.IngredientControllerInterface;
import com.excella.foodinc.services.FoodIncInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Mono;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


import static org.mockito.Mockito.when;
@RunWith(SpringRunner.class)
public class IngredientControllerTest {
    @Autowired
    IngredientControllerInterface ingredientController;
    @MockBean
    FoodIncInterface foodIncInterface;

    @Test
    public void IngredientController_pizzaOutput() {
        Mono<FoodDto> expectedResult = Mono.just(new FoodDto("pizza", 400,4,10, 50));
        when(foodIncInterface.getNutrition("pizza")).thenReturn(expectedResult);
        Mono<FoodDto> result = ingredientController.getNutritionData("pizza");
    }
}

