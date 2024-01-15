package com.splab.algorithms.encrypt;

import java.util.Scanner;

public class ConsoleReader implements ReadAble {
    @Override
    public String readMessage() {
        Scanner input = new Scanner(System.in);
        System.out.println("print message");
        return input.nextLine();
    }
}
