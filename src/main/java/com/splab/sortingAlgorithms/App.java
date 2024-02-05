package com.splab.sortingAlgorithms;

public class App {
    }










//========================================================================
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
    //========================================================================






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

