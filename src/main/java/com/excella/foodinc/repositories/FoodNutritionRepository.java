package com.excella.foodinc.repositories;

import com.excella.foodinc.domain.FoodNutritionalInformation;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodNutritionRepository extends CrudRepository<FoodNutritionalInformation, Long> {

    @Query("SELECT fni FROM food_nutritional_information fni WHERE LOWER(fni.name) = LOWER(:name)")
    List<FoodNutritionalInformation> findFoodByName(@Param("name") String name);
}
