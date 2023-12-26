package com.splab.patterns.behavioralPatterns.iterator;

import lombok.Data;

@Data
public class RestaurantMenu implements Iterator {
    private final MenuPosition[] menuPositions;
    private int currentPosition = 0;



    @Override
    public boolean hasNext() {
        return currentPosition < menuPositions.length;
    }

    @Override
    public MenuPosition next() {
        if (hasNext()) {
            MenuPosition menuPosition = menuPositions[currentPosition];
            currentPosition++;
            return menuPosition;
        } else {
            throw new UnsupportedOperationException("No more items in the menu");
        }
    }
}
