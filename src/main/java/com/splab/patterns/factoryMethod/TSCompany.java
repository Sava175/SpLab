package com.splab.patterns.factoryMethod;

public class TSCompany implements Company{
    @Override
    public Programmer createProgrammer() {
        return new TSProgrammer();
    }
}
