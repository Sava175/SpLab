package com.splab.patterns.behavioralPatterns.state;

import lombok.Data;

@Data
public class Food {
    private Level currentLevel;

    public Food() {
        currentLevel = new SpoiledLevel();
    }

    public void setState(Level currentLevel) {
        this.currentLevel = currentLevel;
    }

    public void startCooking() {
        currentLevel.startCooking();
        setState(new WellDoneLevel());
    }

    public void continueCooking() {
        currentLevel.continueCooking();
    }

    public void finishCooking() {
        currentLevel.finishCooking();
        setState(new WellDoneLevel());
    }
}
