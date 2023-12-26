package com.splab.patterns.creationPatterns.abstrFactory;

public class ChocoIceFactory implements IceFactory{
    @Override
    public IceCr createIceCream() {
        return new IceCream("chocolate flavor", 5);
    }
}

