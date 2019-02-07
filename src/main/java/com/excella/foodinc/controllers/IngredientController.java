package com.excella.foodinc.controllers;

import com.excella.foodinc.common.DummyData;
import com.excella.foodinc.common.FoodDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
@Slf4j

public class IngredientController {

    @GetMapping("/food")
    public Mono<FoodDto> food(@RequestParam(value="recipe", required = false) String recipe){
        return Mono.just(DummyData.foodMap.get(recipe));
    }

}
