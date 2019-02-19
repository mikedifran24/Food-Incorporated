package com.excella.foodinc;

import java.util.ArrayList;
import java.util.List;

public class FoodIncService {

    public List<String> getIngredients(String recipeName) {
        List<String> ingredients = new ArrayList<>();
        if (recipeName.equals("tacos")) {
            ingredients.add("beef");
            ingredients.add("lettuce");
            ingredients.add("lettuce");
            ingredients.add("cheese");
        }
        else if (recipeName.equals("pizza")) {
            ingredients.add("dough");
            ingredients.add("sauce");
            ingredients.add("cheese");
        }
        else if (recipeName.equals("pasta")) {
            ingredients.add("noodles");
            ingredients.add("sauce");
            ingredients.add("meatballs");
        }
        else {
            ingredients.add("bad recipe; ");
            ingredients.add("no ingredients");
        }
        return ingredients;
    }

}