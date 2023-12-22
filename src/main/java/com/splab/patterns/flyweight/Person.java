package com.splab.patterns.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private final String surname;


    public static Person createPerson (String name, String surname){
        return new Person(name, surname);
    }
}
