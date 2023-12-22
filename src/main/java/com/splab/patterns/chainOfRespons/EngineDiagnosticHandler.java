package com.splab.patterns.chainOfRespons;

public class EngineDiagnosticHandler extends ServiceHandler{
    @Override
    public boolean canHandleService(String serviceType) {
        return serviceType.equalsIgnoreCase("Engine Diagnostic");
    }

    @Override
    public void handleService(String serviceType) {
        System.out.println("Performing engine diagnostic service.");
    }
}
