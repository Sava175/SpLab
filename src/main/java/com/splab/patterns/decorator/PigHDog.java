package com.splab.patterns.decorator;

import lombok.Data;

@Data
public class PigHDog implements HotDog{
    private final HotDog decoratedHDog;

    public PigHDog (HotDog hotDog) {
        this.decoratedHDog = hotDog;
    }
    @Override
    public int getPrice() {
        return decoratedHDog.getPrice() + 4;
    }
    @Override
    public String getIngredients() {
        return decoratedHDog.getIngredients() + " beckon";
    }
}
