package com.splab.algorithms.bigO;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UsingQueueS {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
       // O(1).

        if (!queue.isEmpty()) {
            int frontElement = queue.peek();
        } else {
            System.out.println("nothing to peek");
        }
        //return without delete O(1).

        if (!queue.isEmpty()) {
            int removedElement = queue.poll();
        } else {
            System.out.println("nothing to peek");
        }
        //give and remove from the start of the queue O(1).





        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //push() put on the high of stack O(1).

        stack.push(1);
        int top = stack.peek();
        //peek() return without remove O(1).

        stack.push(1);
        int poppedElement = stack.pop();
        // pop() return and delete from stack O(1).
    }
}
