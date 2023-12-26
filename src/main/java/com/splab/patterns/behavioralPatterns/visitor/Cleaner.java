package com.splab.patterns.behavioralPatterns.visitor;

public class Cleaner implements Visitors {
    @Override
    public void visit(Room1 room1) {
        System.out.println("Cleaning first room");
    }
    @Override
    public void visit(Room2 room2) {
        System.out.println("Cleaning second room");
    }
    @Override
    public void visit(Room3 room3) {
        System.out.println("Cleaning third room");
    }

}
