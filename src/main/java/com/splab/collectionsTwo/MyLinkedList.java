package com.splab.collectionsTwo;

public class MyLinkedList<W> implements MyList<W> {
    private Node<W> head;
    private Node<W> tail;
    private int size;

    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        System.out.println("Size of the list: " + myList.size());
        System.out.println("Is the list empty? " + myList.isEmpty());
        System.out.println("Elements in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        String searchElement = "Banana";
        System.out.println("Does the list contain '" + searchElement + "'? " + myList.contains(searchElement));
        System.out.println("Index of '" + searchElement + "': " + myList.indexOf(searchElement));
        myList.remove("Banana");
        System.out.println("Elements in the list after removal:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        myList.clear();
        System.out.println("Size of the list after clearing: " + myList.size());
    }

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
            if (size == 0) {
                tail = newNode;
            }
        } else if (index == size) {
            if (tail == null) {
                head = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
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
