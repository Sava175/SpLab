package com.splab.sortingAlgorithms.slowSort;

import java.util.Arrays;

public class SlowSort {
    // O(n!) чем больше кол элементов тем  длиннее алгортм выполнения
    public static void main(String[] args) {
        int[] array2 = {5, 3, 2, 10, 14, 3, 1, 5, 2};

        slowSort(array2, 0, array2.length - 1);
        System.out.println(Arrays.toString(array2));
    }
    private static void slowSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            slowSort(arr, low, mid);
            slowSort(arr, mid + 1, high);
            if (arr[high] < arr[mid]) {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
            }
            slowSort(arr, low, high - 1);
        }
    }


}
