package com.splab.patterns.facade;


import lombok.Data;

@Data
public class WorkCabinet implements  Room {
    @Override
    public void roomPurpose() {
        System.out.println("We use work cabinets to work in it");
    }
}