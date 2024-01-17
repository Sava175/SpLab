package com.splab.algorithms.encrypt;

public class ConsolePrinter implements PrintAble{
    @Override
    public void printMessage(String message) {
        System.out.println("Your message is " + message);
    }
}
