package com.splab.patterns.abstrFactory;

public class ChocoIceFactory implements IceFactory{
    @Override
    public IceCr createIceCream() {
        return new IceCream("chocolate flavor", 5);
    }
}

