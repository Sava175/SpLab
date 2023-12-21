package com.splab.patterns.bridge;

import lombok.Data;

@Data
public abstract class DishToOrder {
    public Cuisine cuisine;

    public DishToOrder(Cuisine cuisine){
        this.cuisine = cuisine;
    }

    public abstract void makeOrder();


}
