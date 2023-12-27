package com.splab.patterns.structuralPatterns.bridge;

import lombok.Data;


@Data
public class UkrainianCuisine implements Cuisine{
    @Override
    public void cook() {
        System.out.println("we cook today ukrainian borscht");
    }
}
