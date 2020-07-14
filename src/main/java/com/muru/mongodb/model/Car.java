package com.muru.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String brand;
    private String model;
    private Float maxSpeedKmH;
    @SuppressWarnings("unused")
    public Car() {}
}
