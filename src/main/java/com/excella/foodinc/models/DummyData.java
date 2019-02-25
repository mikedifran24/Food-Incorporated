package com.excella.foodinc.models;

import java.util.HashMap;

public class DummyData {
    public static HashMap<String, FoodDTO> map = createData();

    private static HashMap<String, FoodDTO> createData() {
        map = new HashMap<String, FoodDTO>();
        map.put("tacos", new FoodDTO("tacos", 300, 10, 5, 15, 1));
        map.put("pizza", new FoodDTO("pizza", 400, 20, 20, 10, 2));
        map.put("pasta", new FoodDTO("pasta", 350, 3, 10, 15, 3));
        map.put("bad_recipe", new FoodDTO("bad_recipe", 0, 0, 0, 0, 0));
        return map;
    }
}
