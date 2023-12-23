package com.splab.patterns.mediator;

public class Client {
    private final String name;
    private final Waiter waiter;

    public Client(String name, Waiter waiter) {
        this.name = name;
        this.waiter = waiter;
    }

    public String getName() {
        return name;
    }

    public void placeOrder(String order) {
        waiter.takeOrder(order, this);
    }

    public void eat() {
        System.out.println(name + " is enjoying the meal.");
    }
}
