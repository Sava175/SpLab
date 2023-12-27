package com.splab.patterns.behavioralPatterns.interpreter;

import lombok.Data;

import java.util.Map;

@Data
public class Position implements Discount {
    private String itemName;
    private int discount;

    public Position(String itemName, int discount) {
        this.itemName = itemName;
        this.discount = discount;
    }

    @Override
    public int interpreter(Map<String, Integer> items) {
        return items.getOrDefault(itemName, 0) * discount;
    }



}
