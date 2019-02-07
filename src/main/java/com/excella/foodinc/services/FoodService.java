package com.excella.foodinc.services;

import lombok.extern.log4j.Log4j2;
import com.excella.foodinc.FoodItem;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import com.excella.foodinc.common.DummyData;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;

@Log4j2
@Service

public class FoodService {

    DummyData DummyData = new DummyData();

}

