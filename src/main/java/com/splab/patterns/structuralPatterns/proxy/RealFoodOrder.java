package com.splab.patterns.structuralPatterns.proxy;

public class RealFoodOrder implements FoodOrder {
    private final String foodItem;

    public RealFoodOrder(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public void deliver() {
        System.out.println("Delivering " + foodItem);
    }
}
