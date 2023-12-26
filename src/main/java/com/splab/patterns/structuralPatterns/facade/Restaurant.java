package com.splab.patterns.structuralPatterns.facade;

import lombok.Data;

@Data
public class Restaurant {
    public void cook(String item, int amount) {
        System.out.println(amount + " portions of " + item + " are cooked");
    }
}
