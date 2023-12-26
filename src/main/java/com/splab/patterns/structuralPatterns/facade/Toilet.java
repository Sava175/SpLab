package com.splab.patterns.structuralPatterns.facade;

import lombok.Data;


@Data
public class Toilet implements Room {
    @Override
    public void roomPurpose() {
        System.out.println("We use toilet room to make ourself a little bit happier");
    }
}
