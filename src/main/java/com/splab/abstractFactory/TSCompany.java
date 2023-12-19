package com.splab.abstractFactory;

public class TSCompany implements Company{
    @Override
    public Programmer createProgrammer() {
        return new TSProgrammer();
    }
}
