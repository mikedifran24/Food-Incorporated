package com.excella.foodinc.controllers;

import com.excella.foodinc.common.FoodDto;
import com.excella.foodinc.services.FoodIncService;
import static org.assertj.core.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Mono;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.test.StepVerifier;


import static org.mockito.Mockito.when;
@RunWith(SpringRunner.class)
@SpringBootTest
public class IngredientControllerTest {

    @Autowired
    FoodController ingredientController;
    @MockBean
    FoodIncService foodIncService;

    @Test
    public void IngredientController_pizzaOutput() {
        FoodDto expectedDto = new FoodDto("pizza", 400,4,10, 50);
        FoodDto otherDto = new FoodDto("pizza", 300,4,10, 50);

        Mono<FoodDto> expectedResult = Mono.just(expectedDto);
        when(foodIncService.getNutrition("pizza")).thenReturn(expectedResult);


        StepVerifier.create(ingredientController.getNutritionData("pizza"))
                .assertNext(item -> assertThat(item).isEqualToComparingFieldByField(otherDto))
                .verifyComplete();
    }
}

