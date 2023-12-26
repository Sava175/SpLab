package com.splab.patterns.structuralPatterns.bridge;

public class Sausage extends DishToOrder{
    public Sausage(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void makeOrder() {
        System.out.print("Sausage order is on the way. ");
        cuisine.cook();
    }
}
