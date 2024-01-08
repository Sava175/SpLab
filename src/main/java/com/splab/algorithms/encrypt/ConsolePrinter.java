package com.splab.algorithms.encrypt;

public class ConsolePrinter implements PrintAble{
    @Override
    public void sendMessage(String message) {
        System.out.println("Your message is " + message);
    }
}
