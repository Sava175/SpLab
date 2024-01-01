package com.splab.tasks;

import java.util.LinkedList;
import java.util.Scanner;

public class NineTwo {
    public static final String LIST_COMMAND = "1";
    public static final String STOP_COMMAND = "2";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> carNumbers = new LinkedList<>();

        System.out.println("""
                Enter a digit, where
                1 = Show autos list
                2 = Log out
                or number of a car and number in list to add, like:
                BH2753HO 7""");

        while (true) {
            String command = scanner.nextLine();

            if (command.equals(LIST_COMMAND)) {
                showList(carNumbers);
            } else if (command.equals(STOP_COMMAND)) {
                System.out.println("Log out");
                break;
            } else {
                addCarNumber(carNumbers, command);
                System.out.println("Car number was successfully added. " +
                        "Enter a digit (1 = Show autos list, 2 = Log out, or number of a car and number in list to add)");
            }
        }
    }

    private static void showList(LinkedList<String> carNumbers) {
        System.out.println("Autos list:");
        for (String number : carNumbers) {
            System.out.println(number);
        }
    }

    private static void addCarNumber(LinkedList<String> carNumbers, String command) {
        String[] parts = command.split(" ");

                String carNumber = parts[0];
                int position = Integer.parseInt(parts[1]);

                if (position <= 0 || position > carNumbers.size() + 1) {
                    carNumbers.add(carNumber);
                } else {
                    carNumbers.add(position - 1, carNumber);
                }
    }
}


