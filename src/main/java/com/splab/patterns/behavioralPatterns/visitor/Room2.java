package com.splab.patterns.behavioralPatterns.visitor;

public class Room2 implements Office {
    @Override
    public void accept(Visitors visitor) {
        visitor.visit(this);
    }
}
