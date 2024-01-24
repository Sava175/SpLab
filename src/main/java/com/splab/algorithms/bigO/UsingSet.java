package com.splab.algorithms.bigO;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsingSet {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Denis");
        hashSet.add("Vasyl");
        hashSet.add("Dmitriy");
        // insertion of the element O(1)

        boolean containsDenis = hashSet.contains("Denis");
        // check/get element O(1)

        hashSet.remove("apple");
        // O(1)
        
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Denis");
        treeSet.add("Vasyl");
        treeSet.add("Dmitriy");
        // insertion O(log n)

        boolean containsVasyl = treeSet.contains("Vasyl");
        // getting/checking element O(log n)
        treeSet.remove("Denis");
        // deleting O(log n)
    }
}
