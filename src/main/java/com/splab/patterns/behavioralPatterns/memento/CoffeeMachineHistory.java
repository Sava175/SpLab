package com.splab.patterns.behavioralPatterns.memento;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CoffeeMachineHistory {
    private final List<CoffeeMachineMemento> mementoList = new ArrayList<>();

    public void addMemento(CoffeeMachineMemento memento) {
        mementoList.add(memento);
    }
    public CoffeeMachineMemento getMemento(int index) {
        return mementoList.get(index);
    }
}
