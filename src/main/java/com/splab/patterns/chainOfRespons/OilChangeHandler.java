package com.splab.patterns.chainOfRespons;

public class OilChangeHandler  extends ServiceHandler{
    @Override
    public boolean canHandleService(String serviceType) {
        return serviceType.equalsIgnoreCase("Oil Change");
    }

    @Override
    public void handleService(String serviceType) {
        System.out.println("Performing oil change service.");
    }
}
