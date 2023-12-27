package com.splab.patterns.behavioralPatterns.visitor;

public interface Visitors {
    void visit(Room1 room1);

    void visit(Room3 room3);
    void visit(Room2 room2);
}
