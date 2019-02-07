package com.excella.foodinc.common;

import com.excella.foodinc.common.DummyData;
import lombok.extern.slf4j.Slf4j;
import com.excella.foodinc.common.DummyData.*;
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

public class Constants {
    public static final String pizza = "pizza";
}
