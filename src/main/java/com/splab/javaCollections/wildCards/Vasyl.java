package com.splab.javaCollections.wildCards;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Vasyl implements Person{
    private int age;

    @Override
    public void showHowOld() {
        System.out.println(this.age);
    }
}
