package com.splab.algorithms.bigO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingList {
    public static void main(String[] args) {
        List<String> first = new ArrayList<>();
        first.add("Denis");
        first.add("Vasyl");
        first.add("Dmitriy");

        first.add(1, "Vladimir");
        System.out.println(first);
        // Entering new element on position 1   (O(n))

        first.add("Daniil");
        System.out.println(first);
        // Entering new element in the end  (O(1))

        String element = first.get(1);
        System.out.println(element);
        // Getting by index 1   (O(1))


        first.remove(1);
        System.out.println(first);
        // deleting by index

        first.remove("Daniil");
        System.out.println(first);
        // deleting "Daniil" (O(n))


        List<Integer> sortedL = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int index = Collections.binarySearch(sortedL, 5);
        System.out.println(index);

        // binarySearch of element "5" O(log n)
    }
}

