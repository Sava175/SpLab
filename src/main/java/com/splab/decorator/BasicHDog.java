package com.splab.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


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
