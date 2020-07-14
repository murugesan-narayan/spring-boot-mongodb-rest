package com.muru.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private int number;
    private String street;
    private String postcode;
    private String city;
    private String country;
    @SuppressWarnings("unused")
    public Address() {}
}
