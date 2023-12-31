package com.splab.patterns.behavioralPatterns.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class forShow {
    public static void main(String[] args) {
        Discount whiskey = new Position("whiskey", 5);
        Discount champagne = new Position("champagne", 3);

        List<Discount> alcoholDiscounts = new ArrayList<>();
        alcoholDiscounts.add(whiskey);
        alcoholDiscounts.add(champagne);

        Discount totalDiscount = new HoleDiscount(alcoholDiscounts);

        Map<String, Integer> alcohol = Map.of("whiskey", 3, "champagne", 2);
        int totalDiscountAmount = totalDiscount.interpreter(alcohol);

        System.out.println("Discount for all your bottles will be " + totalDiscountAmount);

        // read again and again
        // read again and again
    }
}
