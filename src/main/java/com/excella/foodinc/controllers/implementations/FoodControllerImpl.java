package com.excella.foodinc.controllers.implementations;

import com.excella.foodinc.domain.FoodNutritionalInformation;
import com.excella.foodinc.model.FoodDto;
import com.excella.foodinc.controllers.FoodController;
import com.excella.foodinc.repositories.FoodNutritionRepository;
import com.excella.foodinc.services.FoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping
@Slf4j
@Service
public class FoodControllerImpl implements FoodController {

    @Autowired
    FoodNutritionRepository foodNutritionRepository;
    @Autowired
    FoodService foodService;
    @GetMapping("/nutrition")
    public Mono<FoodDto> getNutritionData(@RequestParam(value="food", required = false) String food){
        return foodService.getNutrition(food);
    }
//    @GetMapping("/nutrition/test")
//    public List<FoodNutritionalInformation> getFoodByName(@RequestParam(value="food", required = false)String food){
//        return foodNutritionRepository.findFoodByName(food);
//    }

}
