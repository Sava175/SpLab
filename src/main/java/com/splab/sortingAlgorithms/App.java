package com.splab.sortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        shellSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }



    //----------------------------------------------------------
    public static void countingSort(int[] array, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[array.length];

        for (int num : array) {
            count[num - min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }
    // O(n + k), where n - items amount, k - diapason of values.
    //-------------------------------------------------------------------->







    //-----------------------------------------------------------------------
    public static void radixSort(int[] array) {
        int maxNumber = Arrays.stream(array).max().getAsInt();

        for (int exp = 1; maxNumber / exp > 0; exp *= 10) {
            countingSortByDigit(array, exp);
        }
    }
    private static void countingSortByDigit(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(array[i] / exp) % 10]++;
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
    //-------------------------------------------------------------------------->>>>


    //-------------------------------------------------------------------------------
    public static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }
    public static void heapify(int[] array, int n, int root) {
        int largest = root;
        int leftChild = 2 * root + 1;
        int rightChild = 2 * root + 2;

        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != root) {
            int temp = array[root];
            array[root] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }
    //  O(n log n)
    //-------------------------------------------------------->






    //---------------------------------------------------------------------------------
    public static void bucketSort(int[] array) {
        int maxValue = findMaxValue(array);
        int minValue = findMinValue(array);
        int bucketCount = (maxValue - minValue) / array.length + 1;

        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int value : array) {
            int bucketIndex = (value - minValue) / array.length;
            buckets.get(bucketIndex).add(value);
        }

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int value : bucket) {
                array[index++] = value;
            }
        }
    }

    private static int findMaxValue(int[] array) {
        int maxValue = array[0];
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    private static int findMinValue(int[] array) {
        int minValue = array[0];
        for (int value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    //  O(n + n^2/k + k), where n - items amount, k - buckets amount
    //------------------------------------------------------------------->>>







    //--------------------------------------------------
    public static void shellSort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {  //
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    int some = array[j - gap];
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
    //O(n^2)
    //---------------------------------------------------------->
    //5
}
