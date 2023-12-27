package com.splab.patterns.behavioralPatterns.state;

public class SpoiledLevel implements Level {
    @Override
    public void startCooking() {
        System.out.println("started cooking");
    }

    @Override
    public void continueCooking() {
        System.out.println("continue cooking");
    }

    @Override
    public void finishCooking() {
        System.out.println("Well, if u don't want to eat - u can be free.\n\n");
    }
}
