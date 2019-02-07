package com.excella.foodinc.common;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@Builder
@Value
@JsonSerialize
public class LombokFoodDto {
    public String name;
    public int calories;
    public int protien;
    public int fat;
}
