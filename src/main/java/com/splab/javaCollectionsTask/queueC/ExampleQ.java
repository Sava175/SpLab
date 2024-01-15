package com.splab.javaCollectionsTask.queueC;

import java.util.*;

public class ExampleQ {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alex");
        queue.offer("Vasyl");
        queue.offer("Denis");
        System.out.println("linked List queue " + queue);



        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("Alex");
        deque.addLast("Vasyl");
        deque.addFirst("Denis");

        System.out.println(deque);


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        priorityQueue.offer(5);
        // take 5 first like it in priority

        System.out.println("PriorityQueue: " + priorityQueue);


    }
}
