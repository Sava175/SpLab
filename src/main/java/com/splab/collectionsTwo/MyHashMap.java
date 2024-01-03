package com.splab.collectionsTwo;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class MyHashMap<K, V> implements MyMap<K, V>{
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private Entry<K, V>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        this.table = (Entry<K, V>[]) new Entry[DEFAULT_CAPACITY];
        this.size = 0;
    }


    @Data
    private static class Entry <K, V>{
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int index = getIndex(key);
        Entry<K, V> entry = table[index];

        while (entry != null) {
            if (key.equals(entry.key)) {
                entry.value = value;
                return;
            }
            entry = entry.next;
        }

        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
        size++;

        if ((double) size / table.length > LOAD_FACTOR) {
            resizeTable();
        }
    }
    @Override
    public boolean remove(K key) {
        if (key == null) {
                throw new IllegalArgumentException("Key cannot be null");
        }

        int index = getIndex(key);
        Entry<K, V> current = table[index];
        Entry<K, V> previous = null;

        while (current != null) {
            if (key.equals(current.key)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false;
    }


    @Override
    public void clear() {
        Arrays.fill(table, null);
        size = 0;
    }


    @Override
    public V get(K key) {
        int index = getIndex(key);
        Entry<K, V> entry = table[index];

        while (entry != null) {
            if (key.equals(entry.key)) {
                return entry.value;
            }
            entry = entry.next;
        }

        return null;
    }


    @Override
    public K[] keyArray() {
        return Arrays.stream(table)
                .filter(Objects::nonNull)
                .flatMap(entry -> Stream.iterate(entry, Objects::nonNull, Entry::getNext))
                .map(Entry::getKey)
                .toArray(size -> {
                    @SuppressWarnings("unchecked")
                    K[] array = (K[]) Array.newInstance(table.getClass().getComponentType().getComponentType(), size);
                    return array;
                });
    }


    @Override
    public V[] valueArray() {
        return Arrays.stream(table)
                .filter(Objects::nonNull)
                .flatMap(entry -> Stream.iterate(entry, Objects::nonNull, Entry::getNext))
                .map(Entry::getValue)
                .toArray(size -> {
                    @SuppressWarnings("unchecked")
                    V[] array = (V[]) Array.newInstance(valueArray().getClass().getComponentType(), size);
                    return array;
                });
    }



    private int getIndex(K key) {
        return key.hashCode() % table.length;
    }
    private void resizeTable() {
        int newCapacity = table.length * 2;
        Entry<K, V>[] newTable = Arrays.copyOf(table, newCapacity);

        for (Entry<K, V> entry : table) {
            while (entry != null) {
                int newIndex = entry.key.hashCode() % newCapacity;
                Entry<K, V> next = entry.next;
                entry.next = newTable[newIndex];
                newTable[newIndex] = entry;
                entry = next;
            }
        }
        table = newTable;
    }





}
