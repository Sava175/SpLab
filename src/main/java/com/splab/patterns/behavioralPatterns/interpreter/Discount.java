package com.splab.patterns.behavioralPatterns.interpreter;

import java.util.Map;

public interface Discount {
    int interpreter(Map<String, Integer> items);
}
