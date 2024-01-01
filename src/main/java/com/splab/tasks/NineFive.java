package com.splab.tasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class NineFive {
    public static void main(String[] args) {
        final int size = 1_000_000;
        Random random = new Random();


        List<Integer> arrayList = new ArrayList<>(size);
        LinkedList<Integer> linkedList = new LinkedList<>();


        for (int i = 0; i < 1000000; i++) {
            arrayList.add(random.nextInt());
            linkedList.add(random.nextInt());
        }

        System.out.printf("%-40s%-15s%-15s%n", "", "ArrayList", "LinkedList");
        printUsedTime("add in the end", () -> arrayList.add(42), () -> linkedList.add(42));
        printUsedTime("add in first half", () -> arrayList.add(size / 2, 42), () -> linkedList.add(size / 2, 42));
        printUsedTime("get item form the end", () -> arrayList.get(size - 1), () -> linkedList.get(size - 1));
        printUsedTime("get item from first half", () -> arrayList.get(size / 4), () -> linkedList.get(size / 4));
        printUsedTime("remove item from the end", () -> arrayList.remove(size - 1), linkedList::removeLast);
        printUsedTime("remove item from first half", () -> arrayList.remove(size / 4), () -> linkedList.remove(size / 4));
    }

    private static void printUsedTime(String operation, Runnable arrayListOperation, Runnable linkedListOperation) {
        long arrayListTime = usedTime(arrayListOperation);
        long linkedListTime = usedTime(linkedListOperation);

        System.out.printf("%-40s%-15d%-15d%n", operation, arrayListTime, linkedListTime);
    }
    private static long usedTime(Runnable operation) {
        long startTime = System.currentTimeMillis();
        operation.run();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
