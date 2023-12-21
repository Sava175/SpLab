package com.splab.patterns.abstrFactory;

public class AppleIceFactory implements IceFactory{
    @Override
    public IceCr createIceCream() {
        return new IceCream("apple flavor", 3);
    }
}
