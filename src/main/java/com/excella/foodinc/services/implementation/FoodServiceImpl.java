package com.excella.foodinc.services.implementation;

import com.excella.foodinc.model.FoodDto;
import com.excella.foodinc.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    public FoodServiceImpl(){}
    public Mono<FoodDto> getNutrition(String foodItem) {
        return null;
    }
}
