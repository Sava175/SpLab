package com.splab.algorithms;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter lettering");
        String equation = scanner.nextLine();

        if (checkBrackets1(equation)) {
            System.out.println("brackets stay good");
        } else {
            System.out.println("not good lettering");
        }

        System.out.println("\n");
        if (checking(equation)) {
            System.out.println("brackets stay good");
        } else {
            System.out.println("not good lettering");
        }
    }

    public static boolean checking(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currChar = chars[i];
            if (currChar == '(' || currChar == '{' || currChar == '['){
                for (int j = chars.length - 1; j > i; j--) {
                    char endChar = chars[j];
                    if (endChar == ')' || endChar == '}' || endChar == ']'){
                        if(isMatchingBracket(currChar, endChar)){
                            chars[i] = 's';
                            chars[j] = 's';
                            break;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean isMatchingBracket(char openingBracket, char endChar) {
        return switch (openingBracket) {
            case '(' -> endChar == ')';
            case '{' -> endChar == '}';
            case '[' -> endChar == ']';
            default -> false;
        };
    }





//------------------------------------------------------------
    private static boolean checkBrackets1(String equation) {
        Stack<Character> stack = new Stack<>();

        for (char ch : equation.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char openBracket = stack.pop();
                if ((ch == ')' && openBracket != '(') ||
                        (ch == ']' && openBracket != '[') ||
                        (ch == '}' && openBracket != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    //-------------------------------------------------------------


}
