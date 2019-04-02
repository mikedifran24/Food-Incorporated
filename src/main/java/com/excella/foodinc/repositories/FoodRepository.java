package com.excella.foodinc.repositories;
import com.excella.foodinc.models.Food;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {
    @Query("SELECT id, name, calories, fat, sugar, protein, filter FROM FOOD f WHERE f.name = :name")
    Food getFoodByName(@Param("name") String name);
}
