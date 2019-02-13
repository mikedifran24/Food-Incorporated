package com.excella.foodinc.controllers.implementations;

import com.excella.foodinc.common.FoodDto;
import com.excella.foodinc.controllers.FoodController;
import com.excella.foodinc.services.FoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
@Slf4j
@Service
public class FoodControllerImpl implements FoodController {

    @Autowired
    FoodService foodService;
    @GetMapping("/nutrition")
    public Mono<FoodDto> getNutritionData(@RequestParam(value="food", required = false) String food){
        return foodService.getNutrition(food);
    }

}
