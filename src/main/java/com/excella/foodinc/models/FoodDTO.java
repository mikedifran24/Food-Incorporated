package com.excella.foodinc.models;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getFilter() {
        return filter;
    }

    public void setFilter(int filter) {
        this.filter = filter;
    }
}
