package com.splab.sortingAlgorithms.heapSort;

import java.util.Arrays;

public class HeapSort {
    //  O(n log n) || n * O(log n)
    //  O(n): Сложность построения начальной кучи
    //  O(log n): Сложность извлечения максимального элемента
    public static void main(String[] args) {
        int[] array = {98, 17, 75, 53, 97, 1, 41, 20, 83, 39};
        heapSort(array);
        System.out.println("printing heap sort " + Arrays.toString(array));
    }
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
}
