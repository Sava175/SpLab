package com.splab.collectionsTwo;

public class MyLinkedList<W> implements MyList<W>{
    private Node<W> head;
    private Node<W> tail;
    private int size;

    private static class Node<W> {
        W value;
        Node<W> prev;
        Node<W> next;
        Node(W value) {
            this.value = value;
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
    public boolean contains(W object) {
        return indexOf(object) != -1;
    }
    @Override
    public void add(W object) {
        add(size, object);
    }
    @Override
    public void add(int index, W object) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<W> newNode = new Node<>(object);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else if (index == size) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            Node<W> current = getNode(index);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }

        size++;
    }
    @Override
    public boolean remove(W object) {
        Node<W> current = head;
        while (current != null) {
            if (current.value.equals(object)) {
                if (current.prev == null) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    current.prev.next = current.next;
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    } else {
                        tail = current.prev;
                    }
                }
                size--;
                return true;
            }
            current = current.next;
        }

        return false;
    }
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public W get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        return getNode(index).value;
    }
    @Override
    public int indexOf(W object) {
        Node<W> current = head;
        int index = 0;
        while (current != null) {
            if (current.value.equals(object)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    @Override
    public int lastIndexOf(W object) {
        Node<W> current = tail;
        int index = size - 1;
        while (current != null) {
            if (current.value.equals(object)) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }

    private Node<W> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<W> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}
