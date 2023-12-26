package com.splab.patterns.behavioralPatterns.template;

public class SausageBreakfast extends Breakfast{
    @Override
    public void prepareIngredients() {
        System.out.println("Take sausage from fridge");
    }

    @Override
    public void cook() {
        System.out.println("Cook sausage");
    }
}
