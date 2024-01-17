package com.splab.algorithms.encrypt;

import java.util.Scanner;

public class ConsoleReader implements ReadAble {
    @Override
    public String writeMessage() {
        Scanner input = new Scanner(System.in);
        System.out.println("write message");
        return input.nextLine();
    }
}
