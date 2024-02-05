package com.splab.sortingAlgorithms.radixSort;

import java.util.Arrays;

public class RadixSort {
    //  O(d * (n + k))   d (10, 100, 1000)
    //  К - kоличество возможных значений для каждого разряда
    public static void main(String[] args) {
        int[] array = {68, 37, 7, 125, 769, 221, 485, 123, 468};
        radixSort(array, 769);
        System.out.println("printing radix sort " + Arrays.toString(array));
    }


    public static void radixSort(int[] array, int maxNum) {

        for (int exp = 1; maxNum / exp > 0; exp *= 10) {
            countingSortByDigit(array, exp);
        }
    }
    private static void countingSortByDigit(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int j : array) {
            count[(j / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }
        System.arraycopy(output, 0, array, 0, n);
    }
    //O(nk), where n - items amount, k - radix amount
}
