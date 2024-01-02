package com.splab.collectionsTwo;

import lombok.Data;

import java.util.Arrays;
import java.util.Objects;

@Data
public class MyArrayList implements MyList{
    private static final int CAPACITY = 10;
    private Integer[] array;
    private int size;

    public MyArrayList() {
        this.array = new Integer[CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Integer object) {
        return indexOf(object) != -1; // return -1 if no object in house
    }

    @Override
    public void add(Integer object) {
        ensureCapacity();
        array[size++] = object;

    }
    @Override
    public void add(int index, Integer object) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("no place for new element. Array is not so big");
        }
        ensureCapacity();
        Integer[] newArray = new Integer[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = object;
        System.arraycopy(array, index, newArray, index + 1, size - index);
        array = newArray;
        size++;
    }

    @Override
    public boolean remove(Integer object) {
        int index = indexOf(object);
        if (index != -1) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            array[--size] = null;
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);//
        size = 0;

    }

    @Override
    public Integer get(int index) {
        return array[index];
    }

    @Override
    public int indexOf(Integer object) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(object, array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer object) {
        for (int i = size - 1; i >= 0; i--) {
            if (Objects.equals(object, array[i])) {
                return i;
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
}
