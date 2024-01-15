package com.splab.collectionsTwo;

public interface MyQueue<T> {
    boolean offer(T object);
    T poll();
    T peek();
}

