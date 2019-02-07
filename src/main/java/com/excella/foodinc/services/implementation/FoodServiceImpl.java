package com.excella.foodinc.services.implementation;

import com.excella.foodinc.common.FoodDto;
import com.excella.foodinc.services.FoodIncInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FoodServiceImpl implements FoodIncInterface {

    @Autowired
    public FoodServiceImpl(){}
    public Mono<FoodDto> getNutrition(String foodItem) {
        return null;
    }
}
