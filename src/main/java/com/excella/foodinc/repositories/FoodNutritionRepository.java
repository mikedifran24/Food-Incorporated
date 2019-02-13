package com.excella.foodinc.repositories;

import com.excella.foodinc.domain.FoodNutritionalInformation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodNutritionRepository extends JpaRepository<FoodNutritionalInformation, Long>{

    List<FoodNutritionalInformation> findFoodByName(String name);
//    @Query("SELECT * FROM Food_Nutritional_Information fni WHERE fni.name = :name")
//    findFoodByName(@Param("name") String name);
}
