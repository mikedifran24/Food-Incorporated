package com.excella.foodinc.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

@Value
public class Food {
    @Id
    private Long id;
    private String name;
    private int calories;
    private int fat;
    private int sugar;
    private int protein;
    private int filter;

    @Builder
    public Food(Long id, String name, int calories, int fat, int sugar, int protein, int filter) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.sugar = sugar;
        this.protein = protein;
        this.filter = filter;
    }
}
