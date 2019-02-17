package com.excella.foodinc.common;

import com.excella.foodinc.model.FoodDto;

import java.util.HashMap;

public class DummyData {
    public static HashMap<String, FoodDto> foodMap = setData();

    public static HashMap<String, FoodDto> setData() {
        HashMap<String, FoodDto> dummyFoodData = new HashMap<String, FoodDto>();
        dummyFoodData.put("pizza", new FoodDto("pizza",400,4,10, 50));
        dummyFoodData.put("apple", new FoodDto("apple",80, 0, 0, 21));
        dummyFoodData.put("talapia ", new FoodDto("talapia",125, 26, 1, 0));
        return dummyFoodData;
    }
}
