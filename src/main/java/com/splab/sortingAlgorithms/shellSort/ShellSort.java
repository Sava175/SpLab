package com.splab.sortingAlgorithms.shellSort;

import java.util.Arrays;

public class ShellSort {
    // O(n^2)
    public static void main(String[] args) {
        int[] array2 = {5, 3, 2, 10, 14, 3, 1, 5, 2};
        shellSort(array2);
        System.out.println(Arrays.toString(array2));
    }

    public static void shellSort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
    }
}
