package com.splab.patterns.mediator;

public interface Waiter {
    void takeOrder(String order, Client client);
    void serveOrder(String order, Client client);
}
