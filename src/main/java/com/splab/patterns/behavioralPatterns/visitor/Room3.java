package com.splab.patterns.behavioralPatterns.visitor;

public class Room3 implements Office {
    @Override
    public void accept(Visitors visitor) {
        visitor.visit(this);
    }
}
