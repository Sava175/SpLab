package com.splab.patterns.bridge;

import lombok.Data;

@Data
public class GermanCuisine implements Cuisine {

    @Override
    public void cook() {
        System.out.println("we cook today german sausages");
    }
}
