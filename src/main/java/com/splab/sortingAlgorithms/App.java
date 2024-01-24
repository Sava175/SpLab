package com.splab.sortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        int[] array = {68, 37, 7, 125, 769, 221, 485, 123, 468};
//        radixSort(array, 769);
//        System.out.println("printing radix sort " + Arrays.toString(array));

//        heapSort(array);
//        System.out.println("printing radix sort " + Arrays.toString(array));

        int[] array2 = {5, 3, 2, 10, 14, 3, 1, 5, 2};
//        bucketSort(array2, 1, 14);
//        System.out.println(Arrays.toString(array2));

//        shellSort(array2);
//        System.out.println(Arrays.toString(array2));

//        combSort(array2);
//        System.out.println(Arrays.toString(array2));

//        gnomeSort(array2);
//        System.out.println(Arrays.toString(array2));

//        stoogeSort(array2, 0, array2.length - 1);
//        System.out.println(Arrays.toString(array2));
    }

    //===========================================================================>>>>

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
    //=======================================================================================>>>>

    //=======================================================================================>>>>
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

    //  O(n log n)  n - array size,
    // build heap O(n)
    // for every element from array
    //for every n element of array making extraction operation of max element
    // and heapifying, also take O(log n) time.
    //=======================================================================================>>>>

    //=======================================================================================>>>>
    public static void bucketSort(int[] array, int minValue, int maxValue) {
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
    // Bucket Sort Big O notation is O(n + n * k), where n = number of elements in array and k = number of buckets.
    //=======================================================================================>>>>

    //=======================================================================================>>>>

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
    //O(n^2)
    //=======================================================================================>>>>

    //=======================================================================================>>>>

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
    //=======================================================================================>>>>

    //=======================================================================================>>>>
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
        // best sorted array - O(n)
    // in case of reverse sort -  O(n^2)
    //=======================================================================================>>>>

    //=======================================================================================>>>>
    private static void stoogeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        if (arr[low] > arr[high]) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }

        if (high - low + 1 > 2) { // divide array into three parts
            int t = (high - low + 1) / 3;
            stoogeSort(arr, low, high - t);
            stoogeSort(arr, low + t, high);
            stoogeSort(arr, low, high - t);
        }
    }
//=======================================================================================>>>>


    }










    // 9 ------------------------------------------------------------------------
    // Average Case: O(n + Range), where Range is the difference between the maximum and minimum values
    //Worst Case: O(n + Range)

//    public class PigeonholeSort {
//        void sort(int arr[]) {
//            int n = arr.length;
//            int min = arr[0], max = arr[0];
//            for (int i = 1; i < n; i++) {
//                if (arr[i] < min) {
//                    min = arr[i];
//                }
//                if (arr[i] > max) {
//                    max = arr[i];
//                }
//            }
//            int range = max - min + 1;
//            int[] pigeonHole = new int[range];
//
//            for (int i = 0; i < n; i++) {
//                pigeonHole[arr[i] - min]++;
//            }
//
//            int index = 0;
//            for (int i = 0; i < range; i++) {
//                while (pigeonHole[i]-- > 0) {
//                    arr[index++] = i + min;
//                }
//            }
//        }
//    }
    //----------------------------------------------------------------------------



















    //--------------------------------------------------------------------------------
    // Average Case: O(log^2 n)
    //Worst Case: O(log^2 n)
//    public class BitonicSort {
//        void bitonicSort(int arr[], int low, int cnt, boolean dir) {
//            if (cnt > 1) {
//                int k = cnt / 2;
//
//                bitonicSort(arr, low, k, true);
//
//                bitonicSort(arr, low + k, k, false);
//
//                bitonicMerge(arr, low, cnt, dir);
//            }
//        }
//
//        void bitonicMerge(int arr[], int low, int cnt, boolean dir) {
//            if (cnt > 1) {
//                int k = cnt / 2;
//                for (int i = low; i < low + k; i++) {
//                    compareAndSwap(arr, i, i + k, dir);
//                }
//                bitonicMerge(arr, low, k, dir);
//                bitonicMerge(arr, low + k, k, dir);
//            }
//        }
//
//        void compareAndSwap(int arr[], int i, int j, boolean dir) {
//            if ((arr[i] > arr[j] && dir) || (arr[i] < arr[j] && !dir)) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//    }
    // 10 ------------------------------------------------------------------------





















    //  ==================================================

    // BogoSort
    // Average Case: O((n+1)!)
//    private static void bogoSort(int[] arr) {
//        Random rand = new Random();
//
//        while (!isSorted(arr)) {
//            shuffle(arr, rand);
//        }
//    }
//
//    private static boolean isSorted(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i - 1] > arr[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static void shuffle(int[] arr, Random rand) {
//        for (int i = arr.length - 1; i > 0; i--) {
//            int j = rand.nextInt(i + 1);
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//    }
    //  ==================================================





















    //  ==================================================
    // Stooge Sort
    // Worst Case: O(n^(log 3 / log 1.5)) ≈ O(n^2.7095)

    //  ==================================================









//    public static void cycleSort(int [] arr) {
//        int n = arr.length;
//
//        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
//            int item = arr[cycleStart];
//
//            int pos = cycleStart;
//            for (int i = cycleStart + 1; i < n; i++) {
//                if (arr[i] < item) {
//                    pos++;
//                }
//            }
//
//            if (pos == cycleStart) {
//                continue;
//            }
//
//            while (item == arr[pos]) {
//                pos++;
//            }
//
//            int temp = arr[pos];
//            arr[pos] = item;
//            item = temp;
//
//            while (pos != cycleStart) {
//                pos = cycleStart;
//                for (int i = cycleStart + 1; i < n; i++) {
//                    if (arr[i] < item) {
//                        pos++;
//                    }
//                }
//
//                while (item == arr[pos]) {
//                    pos++;
//                }
//
//                temp = arr[pos];
//                arr[pos] = item;
//                item = temp;
//            }
//        }














    //  ==================================================

    // Cocktail Shaker Sort
    // Worst Case: O(n^2)
//    private static void cocktailShakerSort(int[] arr) {
//        boolean swapped;
//        do {
//            swapped = false;
//
//            for (int i = 0; i <= arr.length - 2; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                    swapped = true;
//                }
//            }
//
//            if (!swapped) {
//                break;
//            }
//
//            swapped = false;
//
//            for (int i = arr.length - 2; i >= 0; i--) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                    swapped = true;
//                }
//            }
//        } while (swapped);
//    }
    //  ==================================================




















    //  ==================================================
    // Pancake Sort
    // Worst Case: O(n^2)
//    private static void pancakeSort(int[] arr) {
//        for (int i = arr.length - 1; i > 0; i--) {
//            int maxIndex = findMaxIndex(arr, i);
//            flip(arr, maxIndex);
//            flip(arr, i);
//        }
//    }

//    private static int findMaxIndex(int[] arr, int end) {
//        int maxIndex = 0;
//        for (int i = 1; i <= end; i++) {
//            if (arr[i] > arr[maxIndex]) {
//                maxIndex = i;
//            }
//        }
//        return maxIndex;
//    }

//    private static void flip(int[] arr, int k) {
//        int start = 0;
//        while (start < k) {
//            int temp = arr[start];
//            arr[start] = arr[k];
//            arr[k] = temp;
//            start++;
//            k--;
//        }
//    }
    //  ==================================================




















    //  ==================================================
    // Slow Sort
    // Worst Case: O(n^log n)

//    private static void slowSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int mid = (low + high) / 2;
//            slowSort(arr, low, mid);
//            slowSort(arr, mid + 1, high);
//            if (arr[high] < arr[mid]) {
//                int temp = arr[high];
//                arr[high] = arr[mid];
//                arr[mid] = temp;
//            }
//            slowSort(arr, low, high - 1);
//        }
//    }
    //  ==================================================


























    //----------------------------------------------------------
    // Average Case: O(n + k)
    //Worst Case: O(n + k)
//    public static void countingSort(int[] array, int min, int max) {
//        int range = max - min + 1;
//        int[] count = new int[range];
//        int[] output = new int[array.length];
//
//        for (int num : array) {
//            count[num - min]++;
//        }
//        for (int i = 1; i < range; i++) {
//            count[i] += count[i - 1];
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            int index = count[array[i] - min] - 1;
//            if (index >= 0) {
//                output[index] = array[i];
//                count[array[i] - min]--;
//            }
//        }
//        System.arraycopy(output, 0, array, 0, array.length);
//    }

    // O(n + k), where n - items amount, k - diapason of values.
    //-------------------------------------------------------------------->

