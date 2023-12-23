package com.splab.patterns.mediator;

public class Restaurant {
    public void receiveOrder(String order) {
        System.out.println("Restaurant receives order: " + order);
    }

    public void prepareFood(String order) {
        System.out.println("Restaurant is preparing food for order: " + order);
    }

    public void completeOrder(String order) {
        System.out.println("Restaurant completes order: " + order);
    }
}
