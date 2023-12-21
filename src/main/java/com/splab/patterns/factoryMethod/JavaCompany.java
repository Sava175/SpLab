package com.splab.patterns.factoryMethod;

public class JavaCompany implements Company{
    @Override
    public Programmer createProgrammer() {
        return new JavaProgrammer();
    }
}
