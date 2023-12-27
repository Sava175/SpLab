package com.splab.patterns.structuralPatterns.proxy;


public class FoodOrderProxy implements FoodOrder{
    private final String foodItem;

    public FoodOrderProxy(String foodItem) {
        this.foodItem = foodItem;
    }
    @Override
    public void deliver() {
        RealFoodOrder realFoodOrder = new RealFoodOrder(foodItem);
        realFoodOrder.deliver();
    }
}

