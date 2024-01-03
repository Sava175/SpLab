package com.splab.collectionsTwo;

public interface MyList <W> {
    int size();
    boolean isEmpty();
    boolean contains(W object);
    void add(W object);
    void add(int index, W object);
    boolean remove(W object);
    void clear();
    W get(int index);
    int indexOf(W object);
    int lastIndexOf(W object);
}
