package com.splab.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 4};
        System.out.println("bubble sort " + Arrays.toString(bubbleSort(array.clone())));
        System.out.println("selection sort " + Arrays.toString(selectionSort(array.clone())));
        System.out.println("insertion sort " + Arrays.toString(insertionSort(array.clone())));
        System.out.println("quick sort " + Arrays.toString(quickSort(array.clone())));
        System.out.println("merge sort " + Arrays.toString(mergeSort(array.clone())));

    }








    //-----------------------------------------//
    public static int[] selectionSort(int[]array){
        long startTime = System.nanoTime();
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;                      //  6 3 5 5 8 8 3 6
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        long endTime = System.nanoTime();
        System.out.println("selection sort " + (endTime - startTime));
        return array;
    }
    //-----------------------------------------//












    //-----------------------------------------//
    public static int[] bubbleSort(int[]array) {
        long startTime = System.nanoTime();
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {          //  6 3 2 5 8 8 3
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("bubble sort " + (endTime - startTime));
        return array;
    }
    //-----------------------------------------//












    //-----------------------------------------//
    public static int[] insertionSort(int[] array) {
        long startTime = System.nanoTime();
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];  //3       //  6 3 2 5 8 8 3
            int j = i - 1;      //0
            while (j >= 0 && array[j] > key) {     //(0  >= 0  &&  6 > 3)
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;  //3
        }
        long endTime = System.nanoTime();
        System.out.println("Insertion Sort Time: " + (endTime - startTime) + " ns");
        return array;
    }
//-----------------------------------------//










//-----------------------------------------//
    public static int[] quickSort(int[] array) {
        long startTime = System.nanoTime();

        quickSortRecursive(array, 0, array.length - 1);

        long endTime = System.nanoTime();
        System.out.println("Quick Sort Time: " + (endTime - startTime) + " ns");

        return array;
    }

    private static void quickSortRecursive(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSortRecursive(array, low, partitionIndex - 1);
            quickSortRecursive(array, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
    //-------------------------------------//













    //-----------------------------------------//
    public static int[] mergeSort(int[] array) {
        long startTime = System.nanoTime();

        mergeSortRecursive(array, 0, array.length - 1);

        long endTime = System.nanoTime();
        System.out.println("Merge Sort Time: " + (endTime - startTime) + " ns");

        return array;
    }


    private static void mergeSortRecursive(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSortRecursive(array, left, mid);
            mergeSortRecursive(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = Arrays.copyOfRange(array, left, left + n1);
        int[] rightArray = Arrays.copyOfRange(array, mid + 1, mid + 1 + n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < n1) {
            array[k++] = leftArray[i++];
        }
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }
    //-----------------------------------------//











}
