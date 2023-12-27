package com.splab.patterns.structuralPatterns.flyweight;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Restaurant {
    private Map<String, Food> dishMap = new HashMap<>();

    public Food getFood(String name, int cost) {
        if (dishMap.containsKey(name)) {
            return dishMap.get(name);
        } else {
            Food food = new Dish(name, cost);
            dishMap.put(name, food);
            return food;
        }
    }
}
