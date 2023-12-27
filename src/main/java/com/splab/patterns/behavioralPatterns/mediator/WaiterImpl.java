package com.splab.patterns.behavioralPatterns.mediator;

public class WaiterImpl implements Waiter{
    private final Restaurant restaurant;

    public WaiterImpl(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void takeOrder(String order, Client client) {
        restaurant.receiveOrder(order);
        System.out.println("Waiter takes order: " + order + " from client " + client.getName());
    }

    @Override
    public void serveOrder(String order, Client client) {
        restaurant.completeOrder(order);
        System.out.println("Waiter serves order: " + order + " to client " + client.getName());
    }
}
