package com.splab.algorithms;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter lettering");
        String equation = scanner.nextLine();

        if (checkBrackets(equation)) {
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




    public static boolean checking (String input) {
        char[] chars = input.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            char currentChar = chars[i];

            if (isOpeningBracket(currentChar)) {
                char matchingBracket = findMatchingBracket(currentChar);
                int closingIndex = findClosingBracketIndex(chars, i + 1, length, matchingBracket);

                if (closingIndex == -1 || closingIndex >= length) {
                    return false;
                }
                if (chars[closingIndex] != matchingBracket) {
                    return false;
                }
                i = closingIndex;
            }
        }
        return true;
    }
    private static int findClosingBracketIndex(char[] chars, int start, int length, char matchingBracket) {
        for (int i = length - 1; i >= start; i--) {
            if (chars[i] == matchingBracket) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isOpeningBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private static char findMatchingBracket(char openingBracket) {
        switch (openingBracket) {
            case '(':
                return ')';
            case '{':
                return '}';
            case '[':
                return ']';
            default:
                throw new IllegalArgumentException("Invalid opening bracket: " + openingBracket);
        }
    }























    private static boolean checkBrackets(String equation) {
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


}
