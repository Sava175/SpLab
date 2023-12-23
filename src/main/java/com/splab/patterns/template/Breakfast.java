package com.splab.patterns.template;

public abstract class Breakfast {
    public void warmUpTheSkillet() {
        System.out.println("making the skillet warmer");
    }
    public void serve() {
        System.out.println("set cooked product on the table");
    }
    public abstract void prepareIngredients();
    public abstract void cook();
    public final void prepareBreakfast() {
        warmUpTheSkillet();
        prepareIngredients();
        cook();
        serve();
    }
}
