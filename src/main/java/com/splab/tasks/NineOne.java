package com.splab.tasks;

import lombok.Data;

import java.util.*;

@Data
public class NineOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> numbers = new LinkedList<>();
        System.out.println("enter the command/number");

        while (true){
            String command = scanner.nextLine();
            if (command.equals("List")){
                System.out.println("So here is the list of autos");
                for(String showNumbers:numbers){
                    System.out.println(showNumbers);
                }
                System.out.println("what next?");
            } else if (command.equals("Stop")) {
                System.out.println("thank you for visit");
                break;
            }else {
                numbers.add(command);
                System.out.println("the number was successfully added. What next?");
            }
        }

    }
}
