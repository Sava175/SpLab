package com.splab.javaCollections.wildCards;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Alex implements Person{
    private int age;
    @Override
    public void showHowOld() {
        System.out.println(this.age);
    }
}
