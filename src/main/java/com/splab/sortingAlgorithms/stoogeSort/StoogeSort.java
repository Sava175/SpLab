package com.splab.sortingAlgorithms.stoogeSort;

import java.util.Arrays;

public class StoogeSort {
    public static void main(String[] args) {

        int[] array2 = {5, 3, 2, 10, 14, 3, 1, 5, 2};

        stoogeSort(array2, 0, array2.length - 1);
        System.out.println(Arrays.toString(array2));
    }

    public static void stoogeSort(int[] arr, int l, int h) {
        if (l >= h)
            return;

        // when digit by index > array2.length - 1 we change it
        if (arr[l] > arr[h]) {
            int t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
        }

        //if we have more, that 2 elements
        if (h - l + 1 > 2) {
            int t = (h - l + 1) / 3;

            stoogeSort(arr, l, h - t); // for  2/3 elements we make recur sort f
            stoogeSort(arr, l + t, h); // for  2/3 elements we make recur sort l
            stoogeSort(arr, l, h - t); // for  2/3 elements we make recur sort f
        }
    }
}
