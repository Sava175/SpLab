package com.splab.sortingAlgorithms.bogoSort;

import java.util.Arrays;
import java.util.Random;

public class BogoSort {
    // O((n+1)!)
    public static void main(String[] args) {
        int[] array2 = {5, 3, 2, 10, 14, 3, 1, 5, 2};
        bogoSort(array2);
        System.out.println(Arrays.toString(array2));
    }
    private static void bogoSort(int[] arr) {
        Random rand = new Random();
        int some = 0;

        while (!isSorted(arr)) {
            shuffle(arr, rand);
            some+=1;
        }
        System.out.println(some);
    }
    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
    private static void shuffle(int[] arr, Random rand) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    // BogoSort
    // Average Case: O((n+1)!)
}
