package com.splab.algorithms.indexSearch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter the size of array u want to create");
        int arraySize = scanner.nextInt();
        int [] array = fillTheArrayIn(arraySize);

            System.out.println("Now pls enter the digit and i'll give u index using usual loop");
            int digit = scanner.nextInt();
            usualSearch(array, digit);

            System.out.println("Now enter digit again i'll show, how quick it will find it with binary search");
            Arrays.sort(array);
            binarySearch(array, digit);

    }



    public static int[] fillTheArrayIn(int size){
        int [] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101 );
        }
        return array;
    }

    public static void usualSearch(int[] array, int digit){
        int steps = 0;
        for (int i = 0; i < array.length; i++) {
            steps++;
            if (array[i] == digit){
                System.out.println("index of the digit is " + i + " . It took " + steps + " to find digit");
                return;
            }
        }
        System.out.println("digit is not here");

    }

    private static void binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int steps = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            steps++;

            if (array[mid] == target) {
                System.out.println("index of your digit is " + array[mid] + " . It took " + steps + " to find digit");
                return;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("no digit in array");
    }

}
