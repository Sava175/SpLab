package com.splab.sortingAlgorithms.combSort;

import java.util.Arrays;

public class CombSort {
    // O(n^2/2^p)
    public static void main(String[] args) {
        int[] array2 = {5, 3, 2, 10, 14, 3, 1, 5, 2};
        combSort(array2);
        System.out.println(Arrays.toString(array2));
    }

    public static void combSort(int[] arr){
        int n = arr.length;
        int gap = n;
        boolean swapped = true;

        while (gap != 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;
            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
            }
        }
    }
    static int getNextGap(int gap) {
        gap = (gap * 10) / 13;
        return Math.max(gap, 1);
    }
}
