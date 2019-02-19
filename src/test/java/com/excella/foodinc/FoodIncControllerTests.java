package com.excella.foodinc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebFluxTest
@WebAppConfiguration
public abstract class FoodIncControllerTests {

    @Autowired
    private WebTestClient webTestClient;

    protected void setUp() {
    }

    @Test
    public void testRecipe()  {
//        webTestClient.get().uri("/recipe?name=tacos")
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody(Flux.class)
//                .isEqualTo(Flux.just("beef", "lettuce", "cheese"));
    }
}