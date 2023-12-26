package com.splab.patterns.behavioralPatterns.chainOfRespons;

public abstract class ServiceHandler {
    private ServiceHandler nextHandler;

    public void setNextHandler(ServiceHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void performService(String serviceType) {
        if (canHandleService(serviceType)) {
            handleService(serviceType);
        } else if (nextHandler != null) {
            nextHandler.performService(serviceType);
        } else {
            System.out.println("Sorry, we can't perform the requested service.");
        }
    }

    public abstract boolean canHandleService(String serviceType);
    public abstract void handleService(String serviceType);
}
