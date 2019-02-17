package com.excella.foodinc.domain;

import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.excella.foodinc.repositories.FoodNutritionRepository;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import lombok.experimental.NonFinal;
import org.springframework.data.annotation.PersistenceConstructor;

@Value
public class FoodNutritionalInformation {
   @NonFinal @Id private Long id;
    String name;
    int calories;
    int protein;
    int fat;
    int carbs;
@Builder public FoodNutritionalInformation(Long id, String name, int calories, int protein, int fat, int carbs){
   this.id = id;
   this.name = name;
   this.calories = calories;
   this.protein = protein;
   this.fat = fat;
   this.carbs = carbs;
 }
}
