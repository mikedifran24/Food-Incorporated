package com.excella.foodinc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodIncControllerTests {
    @Autowired
    private FoodIncController foodIncController;

    @MockBean
    private FoodIncService foodIncService;

    protected void setUp() {
        foodIncController = new FoodIncController();
    }

    @Test
    public void testRecipe()  {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("beef");
        ingredients.add("lettuce");
        ingredients.add("cheese");

        Flux<String> data = Flux.fromIterable(ingredients);


        Mockito.when(this.foodIncController.recipe(Mockito.any(String.class)))
                .thenReturn(data);

        Flux<String> recipe = foodIncController.recipe("tacos");

        StepVerifier
                .create(recipe)
                .expectNext("beef", "lettuce", "cheese")
                .verifyComplete();
    }
}