package com.excella.foodinc.models;

import java.util.HashMap;

public class RecipeDTO {
    private HashMap<String, RecipeObject> map;

    public RecipeDTO() {
        map = new HashMap<String, RecipeObject>();
    }

    public RecipeObject getRecipe(String name) {
        return map.get(name);
    }
}
