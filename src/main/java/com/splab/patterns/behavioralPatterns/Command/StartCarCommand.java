package com.splab.patterns.behavioralPatterns.Command;

public class StartCarCommand implements Command{
    private final Car car;

    public StartCarCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.start();
    }
}
