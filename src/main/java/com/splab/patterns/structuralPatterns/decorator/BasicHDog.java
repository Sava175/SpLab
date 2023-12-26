package com.splab.patterns.structuralPatterns.decorator;

import lombok.Data;


@Data
public class BasicHDog implements HotDog{
    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String getIngredients() {
        return "bun, ketchup, sausage";
    }
}
