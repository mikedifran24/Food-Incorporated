package com.excella.foodinc.common;

import java.util.HashMap;

public class DummyData {
    public static final String[] pizzaIngredients = {"crust", "tomato sauce", "cheese", "pepperoni"};
    public static final String[] spaghettiIngredients = {"noodles", "tomato sauce", "meatballs"};
    public static final String[] saladIngredients = {"spinach", "cucumbers", "carrots", "tomatoes"};
    public HashMap<String, Object> ingredientData;
    public HashMap<String, Object> buildDataSet(){
        ingredientData.put("pizza", pizzaIngredients);
        ingredientData.put("spaghetti", spaghettiIngredients);
        ingredientData.put("salad", saladIngredients);
        return ingredientData;
    }
}
