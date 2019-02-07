package com.excella.foodinc.controllers;

import com.excella.foodinc.common.DummyData;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping
@Slf4j

public class IngredientController {

    @GetMapping("/food")
    public Mono<String> food(@RequestParam(value="recipe", required = false) String recipe){
        DummyData DummyData = new DummyData();
        if(recipe.equals("pizza")){
            return Mono.just(DummyData.buildDataSet().get(recipe).toString());
        } else {
            return Mono.just(recipe);
        }
    }

}
