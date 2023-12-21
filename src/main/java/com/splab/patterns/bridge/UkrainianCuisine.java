package com.splab.patterns.bridge;

import lombok.Data;


@Data
public class UkrainianCuisine implements Cuisine{
    @Override
    public void cook() {
        System.out.println("we cook today ukrainian soup");
    }
}
