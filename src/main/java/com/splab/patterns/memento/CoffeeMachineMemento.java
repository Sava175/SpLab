package com.splab.patterns.memento;

import lombok.Data;

@Data
public class CoffeeMachineMemento {
    private final String state;

    public String getState() {
        return state;
    }
}
