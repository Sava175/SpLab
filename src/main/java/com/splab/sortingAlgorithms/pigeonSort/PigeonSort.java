package com.splab.sortingAlgorithms.pigeonSort;

public class PigeonSort {
    //  O ( n + Range ), где n — количество элементов во входном массиве, а «Range» — количество возможных значений в массиве
    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 7, 4, 6, 8};
        pigeonholeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void pigeonholeSort(int[] arr) {
        int n = arr.length;

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        int range = max - min + 1;
        int[] array = new int[range];

        for (int num : arr) {
            array[num - min]++;
        }
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (array[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }
}

