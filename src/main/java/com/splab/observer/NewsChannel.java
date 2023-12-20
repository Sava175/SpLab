package com.splab.observer;

import lombok.Data;

@Data
public class NewsChannel implements Observer{
    private final String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String message) {
        System.out.println("Breaking News on " + channelName + ": " + message);
    }
}
