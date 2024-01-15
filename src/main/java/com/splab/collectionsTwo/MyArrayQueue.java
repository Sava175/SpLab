package com.splab.collectionsTwo;

import lombok.Data;

import java.util.Arrays;

@Data
public class MyArrayQueue<T> implements MyQueue<T> {
    private static final int CAPACITY = 10;
    private Object[] array;
    private int size;

    public MyArrayQueue() {
        this.array = new Object[CAPACITY];
        size = 0;
    }

    public static void main(String[] args) {
        MyArrayQueue<Integer> myQueue = new MyArrayQueue<>();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);

        System.out.println("Size of myQueue: " + myQueue.size);
        System.out.println("Is myQueue empty? " + myQueue.isEmpty());
        System.out.println("Element at the front of myQueue: " + myQueue.peek());

        System.out.println("Polling elements from myQueue:");
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.poll());
        }

        System.out.println("Size of myQueue after polling: " + myQueue.size);
    }

    @Override
    public boolean offer(T object) {
        ensureCapacity();
        array[size++] = object;
        return true;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        @SuppressWarnings("unchecked")
        T frontElement = (T) array[0];
        System.arraycopy(array, 1, array, 0, size - 1);
        array[--size] = null;
        return frontElement;
    }

    @Override
    public T peek() {
        return isEmpty() ? null : (T) array[0];
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
}
