package com.splab.patterns.behavioralPatterns.template;

public class BeckonBreakfast extends Breakfast{
    @Override
    public void prepareIngredients() {
        System.out.println("Take beckon");
    }

    @Override
    public void cook() {
        System.out.println("Cook beckon");
    }
}
