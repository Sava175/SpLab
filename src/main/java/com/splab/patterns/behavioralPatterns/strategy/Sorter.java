package com.splab.patterns.behavioralPatterns.strategy;

public class Sorter {
    private SortingStrategy sortingStrategy;
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array) {
        sortingStrategy.sort(array);
    }

}
