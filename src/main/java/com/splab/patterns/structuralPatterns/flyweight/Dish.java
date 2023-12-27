package com.splab.patterns.structuralPatterns.flyweight;

import lombok.Data;

@Data
public class Dish implements Food{
    private String name;
    private int cost;

    public Dish(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public void serveFood() {
        System.out.println("Cooking " + name + " that cost " + cost + " dollars.");
    }
}
