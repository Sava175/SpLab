package com.splab.tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class NineFour {
    public static final String LIST_COMMAND = "List/Owners";
    public static final String STOP_COMMAND = "Stop";
    public static final String AUTOS_COMMAND = "Autos";
    public static final String OWNERS_COMMAND = "Owners";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> carOwners = new HashMap<>();

        System.out.println("""
                Enter a car number, owner, or command:
                List/Owners - Show autos list with owners
                Autos - Show autos list
                Owners - Show owners list
                Stop - Log out""");


        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase(LIST_COMMAND)) {
                showList(carOwners);
            } else if (input.equalsIgnoreCase(AUTOS_COMMAND)) {
                showAutos(carOwners);
            } else if (input.equalsIgnoreCase(OWNERS_COMMAND)) {
                showOwners(carOwners);
            } else if (input.equalsIgnoreCase(STOP_COMMAND)) {
                System.out.println("Log out");
                break;
            } else {
                addCarNumber(carOwners, input);
                System.out.println("Car number and owner were added. " +
                        "Enter a car number, owner, or command (List/Owners, Autos, Owners, Stop)");
            }
        }
    }


    private static void showList(Map<String, String> carOwners) {
        System.out.println("Autos list with owners:");
        for (Map.Entry<String, String> entry : carOwners.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static void showAutos(Map<String, String> carOwners) {
        System.out.println("Autos list:");
        for (String carNumber : carOwners.keySet()) {
            System.out.println(carNumber);
        }
    }

    private static void showOwners(Map<String, String> carOwners) {
        System.out.println("Owners list:");
        for (String owner : new HashSet<>(carOwners.values())) {
            System.out.println(owner);
        }
    }

    private static void addCarNumber(Map<String, String> carOwners, String input) {
        String[] parts = input.split(" ");
        String carNumber = parts[0];
        String owner = parts[1];

        carOwners.put(carNumber, owner);
    }
}
