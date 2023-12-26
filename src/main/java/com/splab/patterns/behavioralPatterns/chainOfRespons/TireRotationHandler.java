package com.splab.patterns.behavioralPatterns.chainOfRespons;

public class TireRotationHandler extends ServiceHandler{
    @Override
    public boolean canHandleService(String serviceType) {
        return serviceType.equalsIgnoreCase("Tire Rotation");
    }

    @Override
    public void handleService(String serviceType) {
        System.out.println("Performing tire rotation service.");
    }
}
