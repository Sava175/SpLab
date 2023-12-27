package com.splab.patterns.creationPatterns.abstrFactory;

public class IceCreamLover {
    public void enjoyIceCream(IceFactory factory) {
        IceCr iceCream = factory.createIceCream();

        System.out.println("Enjoying " + iceCream);
    }
}
