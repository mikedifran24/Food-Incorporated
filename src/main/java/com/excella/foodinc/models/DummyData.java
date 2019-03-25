package com.excella.foodinc.models;

import com.excella.foodinc.DTO.FoodDTO;

import java.util.HashMap;

public class DummyData {
    public static HashMap<String, Food> map = createData();

    private static HashMap<String, Food> createData() {
        map = new HashMap();
        map.put("tacos", new Food(1, "tacos", 300, 10, 5, 15, 1));
        map.put("pizza", new Food(2, "pizza", 400, 20, 20, 10, 2));
        map.put("pasta", new Food(3, "pasta", 350, 3, 10, 15, 3));
        map.put("bad_recipe", new Food(4, "bad_recipe", 0, 0, 0, 0, 0));
        return map;
    }
}
