package com.excella.foodinc.common;

import java.util.HashMap;

public class DummyData {
    public static HashMap<String, FoodDto> foodMap = new HashMap<String, FoodDto>();
    private static FoodDto tmp = foodMap.put("pizza", new FoodDto("pizza",400,4,10));

}


