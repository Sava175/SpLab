package com.splab.patterns.behavioralPatterns.Command;

public class StopCarCommand implements Command{
    private final Car car;

    public StopCarCommand(Car car) {
        this.car = car;
    }
    @Override
    public void execute() {
        car.stop();
    }
}
