package com.splab.patterns.facade;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Office {
    List<Room> rooms;
    public Office() {
        this.rooms = new ArrayList<>();
    }

}
