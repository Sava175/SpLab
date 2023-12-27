package com.splab.patterns.structuralPatterns.bridge;
public class Borscht extends DishToOrder{
    public Borscht(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void makeOrder() {
        System.out.print("Borscht order is on the way. ");
        cuisine.cook();
    }
}
