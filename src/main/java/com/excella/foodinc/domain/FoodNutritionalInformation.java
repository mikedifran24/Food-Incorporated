package com.excella.foodinc.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.NonFinal;
import org.springframework.data.annotation.PersistenceConstructor;

@JsonSerialize
@Value
@Entity
@Table(name = "Food_Nutritional_Information")
public class FoodNutritionalInformation {
   @Id private Long id;
    String name;
    int calories;
    int protein;
    int fat;
    int carbs;

   @Builder(toBuilder = true)
   @PersistenceConstructor
    public FoodNutritionalInformation(Long id, String name, int calories, int protein, int fat, int carbs){
           this.id = id;
           this.name = name;
           this.calories = calories;
           this.protein = protein;
           this.fat = fat;
           this.carbs = carbs;
   }
}
