package com.splab.patterns.structuralPatterns.facade;

public class Delivery {
    public void deliver(String item, int amount, String address) {
        System.out.println(amount + " portions of  " + item + " we be delivered to " + address);
    }
}
