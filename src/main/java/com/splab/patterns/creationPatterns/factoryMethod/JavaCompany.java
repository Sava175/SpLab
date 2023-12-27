package com.splab.patterns.creationPatterns.factoryMethod;

public class JavaCompany implements Company{
    @Override
    public Programmer createProgrammer() {
        return new JavaProgrammer();
    }
}
