package com.splab.collectionsTwo;

import lombok.Data;

import java.util.Arrays;
import java.util.Objects;

@Data
public class MyArrayList<W> implements MyList<W>{
    private static final int CAPACITY = 10;
    private Object[] array;
    private int size;

    public MyArrayList() {
        this.array = new Object[CAPACITY];
        size = 0;
    }

    public static void main(String[] args) {
        MyArrayList<String> stringList = new MyArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");


        System.out.println("Size of stringList: " + stringList.size());
        System.out.println("Is stringList empty? " + stringList.isEmpty());
        System.out.println("Elements in stringList: ");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println("Does stringList contain 'Banana'? " + stringList.contains("Banana"));
        System.out.println("Last Index of 'Banana': " + stringList.lastIndexOf("Banana"));
        stringList.remove("Banana");
        System.out.println("Elements in stringList after removal: ");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        stringList.clear();
        System.out.println("Size of stringList after clearing: " + stringList.size());
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
    public boolean contains(W object) {
        return indexOf(object) != -1; // return -1 if no object in house
    }

    @Override
    public void add(W object) {
        ensureCapacity();
        array[size++] = object;

    }
    @Override
    public void add(int index, W object) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("no place for new element. Array is not so big");
        }
        ensureCapacity();
        Object[] newArray = new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = object;
        System.arraycopy(array, index, newArray, index + 1, size - index);
        array = newArray;
        size++;
    }

    @Override
    public boolean remove(W object) {
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
    public W get(int index) {
        return (W) array[index];
    }

    @Override
    public int indexOf(W object) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(object, array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(W object) {
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
