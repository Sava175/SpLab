package com.splab.patterns.behavioralPatterns.state;

public class WellDoneLevel implements Level {
    @Override
    public void startCooking() {
        System.out.println("The food is already cooked");
    }

    @Override
    public void continueCooking() {
        System.out.println("Continue cooking, not finished yet");
    }

    @Override
    public void finishCooking() {
        System.out.println("Ready. You can enjoy your eat\n\n");
    }
}
