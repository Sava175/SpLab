package com.splab.patterns.facade;

import lombok.Data;
@Data
public class Kitchen implements Room{
    @Override
    public void roomPurpose() {
        System.out.println("while making pause we can drink coffee and eat using kitchen");
    }
}
