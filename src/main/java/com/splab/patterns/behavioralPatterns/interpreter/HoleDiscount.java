package com.splab.patterns.behavioralPatterns.interpreter;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class HoleDiscount implements Discount {
    private List<Discount> salesForWhichItems;

    public HoleDiscount(List<Discount> salesForWhichItems) {
        this.salesForWhichItems = salesForWhichItems;
    }

    @Override
    public int interpreter(Map<String, Integer> items) {
        int totalDiscount = 0;
        for (Discount expression : salesForWhichItems) {
            totalDiscount += expression.interpreter(items);
        }
        return totalDiscount;
    }
}
