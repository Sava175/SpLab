package com.splab.patterns.structuralPatterns.facade;

import lombok.Data;

@Data
public class FoodOrderFacade {
    private Restaurant restaurant;
    private Delivery delivery;
    public FoodOrderFacade() {
        this.restaurant = new Restaurant();
        this.delivery = new Delivery();
    }

    public void placeOrder(String item, int amount, String address) {

        restaurant.cook(item, amount);
        delivery.deliver(item, amount, address);

    }
}
