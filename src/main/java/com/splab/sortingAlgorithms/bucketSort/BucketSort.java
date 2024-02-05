package com.splab.sortingAlgorithms.bucketSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    // depends on how good elements divides into buckets
    // O(n + k)
    public static void main(String[] args) {
        int[] array2 = {5, 3, 2, 10, 14, 3, 1, 5, 2};
        bucketSort(array2, 1, 14);
        System.out.println(Arrays.toString(array2));
    }

    public static void bucketSort(int[] array, int minValue, int maxValue) {
        int bucketSize = array.length;
        int bucketCount = (maxValue - minValue) / bucketSize + 1;
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int value : array) {
            int bucketIndex = (value - minValue) / bucketSize;

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
}
