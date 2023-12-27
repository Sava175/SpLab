package com.splab.patterns.behavioralPatterns.visitor;

public class ForShow {
    public static void main(String[] args) {
        Office room1 = new Room1();
        Office room2 = new Room2();
        Office room3 = new Room3();

        Visitors repairVisitor = new Cleaner();

        room1.accept(repairVisitor);
        room2.accept(repairVisitor);
        room3.accept(repairVisitor);
    }
}
