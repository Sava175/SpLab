package com.splab.sortingAlgorithms.gnomSort;

import java.util.Arrays;

public class GnomSort {
    // O(n^2)
    // best sorted array - O(n)
    // in case of reverse sort -  O(n^2)
    public static void main(String[] args) {
        int[] array2 = {5, 3, 2, 10, 14, 3, 1, 5, 2};
        gnomeSort(array2);
        System.out.println(Arrays.toString(array2));
    }

    public static void gnomeSort(int[] arr) {
        int n = arr.length;
        int index = 0;

        while (index < n) {
            if (index == 0) {
                index++;
            }
            if (arr[index] >= arr[index - 1]) {
                index++;
            } else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }

}
