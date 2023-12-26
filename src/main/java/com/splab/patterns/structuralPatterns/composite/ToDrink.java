package com.splab.patterns.structuralPatterns.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDrink implements Component {
    private String name;

    @Override
    public void showComponent() {
        System.out.println(name);
    }
}
