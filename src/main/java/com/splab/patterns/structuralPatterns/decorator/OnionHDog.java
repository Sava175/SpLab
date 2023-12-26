package com.splab.patterns.structuralPatterns.decorator;

import lombok.Data;


@Data
public class OnionHDog implements HotDog{
    private final HotDog decoratedHDog;


    public OnionHDog(HotDog hotDog){
        this.decoratedHDog = hotDog;
    }
    @Override
    public int getPrice() {
        return decoratedHDog.getPrice() + 2;
    }

    @Override
    public String getIngredients() {
        return decoratedHDog.getIngredients() + ", onion";
    }
}
