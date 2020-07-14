package com.muru.mongodb.controller;

import com.muru.mongodb.model.Address;
import com.muru.mongodb.model.Car;
import com.muru.mongodb.model.Person;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

@Component
class TestHelper {

    Person getMax() {

        return new Person(null, "Maxime", "Beugnet", 31,
                new Address(1,"Kolonie Street","12345", "Paris","France"),
                new Date(), true,
                Collections.singletonList(new Car("Ferrari", "SF90 Stradale", 339f)));
    }

    Person getAlex() {
        return new Person(null, "Alex", "Beugnet", 35,
                new Address(2, "Toulouse Street", "54321", "Paris", "France"),
                new Date(), false,
                Collections.singletonList(new Car("Mercedes", "Project One", 355f)));
    }

    List<Person> getListMaxAlex() {
        return asList(getMax(), getAlex());
    }
}
