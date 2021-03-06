package com.excella.foodinc.DTO;

import lombok.Builder;
import lombok.Value;

@Value @Builder
public class FoodDTO {
    private String name;
    private int calories;
    private int fat;
    private int sugar;
    private int protein;
    private int filter;

    public FoodDTO(String name, int calories, int fat, int sugar, int protein, int filter) {
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.sugar = sugar;
        this.protein = protein;
        this.filter = filter;
    }
}
