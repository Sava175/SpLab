package com.splab.patterns.abstrFactory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class IceCream implements IceCr {
    private String flavor;
    private int cost;

    @Override
    public void eat() {
        System.out.println("nice ice with " + flavor + " flavor and cost only " + cost + " euros");
    }
}
