package com.excella.foodinc;

import com.excella.foodinc.models.FoodDTO;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodIncControllerTests {
    @Autowired
    private FoodIncController foodIncController;

    @MockBean
    private FoodIncService foodIncService;

    @Test
    public void testRecipe()  {
        FoodDTO ingredients = new FoodDTO("tacos", 300, 10, 5, 15, 1);

        Mockito.when(this.foodIncService.getFoodInfo("tacos"))
                .thenReturn(Mono.just(ingredients));

        Mono<FoodDTO> recipe = foodIncController.getFood("tacos");

        StepVerifier
                .create(recipe)
                .assertNext(food -> Assertions.assertThat(food).isEqualToComparingFieldByField(ingredients))
                .verifyComplete();
    }
}