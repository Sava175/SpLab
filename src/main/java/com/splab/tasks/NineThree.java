package com.splab.tasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NineThree {
    public static final String LIST_COMMAND = "List";
    public static final String STOP_COMMAND = "Stop";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> carNumbers = new HashSet<>();

        System.out.println("""
                Enter a car number or command:
                List - Show autos list
                Stop - Log out""");


        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase(LIST_COMMAND)) {
                showList(carNumbers);
            } else if (input.equalsIgnoreCase(STOP_COMMAND)) {
                System.out.println("Log out");
                break;
            } else {
                addCarNumber(carNumbers, input);
                System.out.println("Car number was successfully added. " +
                        "Enter a car number or command (List, Stop)");
            }
        }


    }

    private static void showList(Set<String> carNumbers) {
        System.out.println("Autos list:");
        for (String number : carNumbers) {
            System.out.println(number);
        }
    }

    private static void addCarNumber(Set<String> carNumbers, String input) {
        if (carNumbers.add(input)) {
            System.out.println("Car number was successfully added.");
        } else {
            System.out.println("Car number already exists. Please enter a different car number.");
        }
    }
}
