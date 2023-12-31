package com.splab.genericsE;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class ExampleGen {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Vasyl");

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(7);

        List<Box<?>> some = new ArrayList<>();
        some.add(stringBox);
        some.add(integerBox);
        showWildCard(some);
    }

    @Data
    public static class Box<T> {
        private T value;

    }
    public static void showWildCard(List<? extends Box<?>> list) {
        for (Box<?> box : list) {
            System.out.println(box.getValue());
        }
    }
}
