package com.splab.abstractFactory;

public class JavaCompany implements Company{
    @Override
    public Programmer createProgrammer() {
        return new JavaProgrammer();
    }
}
