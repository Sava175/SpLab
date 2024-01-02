package com.splab.collectionsTwo;

public interface MyMap {
    int size();
    boolean isEmpty();
    void put(String key, Integer value);
    boolean remove(String key);
    void clear();
    Integer get(String key);
    String[] keyArray();
    Integer[] valueArray();
}
