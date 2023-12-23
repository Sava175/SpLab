package com.splab.patterns.memento;

import lombok.Data;

@Data
public class CoffeeMachine {
    private String coffeeType;

    public CoffeeMachineMemento saveStateToMemento() {
        return new CoffeeMachineMemento(coffeeType);
    }
    public void restoreStateFromMemento(CoffeeMachineMemento memento) {
        this.coffeeType = memento.getState();
    }
}
