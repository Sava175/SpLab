package com.splab.patterns.creationPatterns.factoryMethod;

public class TSCompany implements Company{
    @Override
    public Programmer createProgrammer() {
        return new TSProgrammer();
    }
}
