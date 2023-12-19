package com.splab.singletone;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductionManager {

    private String name;
    private String surname;
    private static ProductionManager instance;

    public static ProductionManager getInstance(String name, String surname) {
        if (instance == null) {
            instance = new ProductionManager(name, surname);
        }
        return instance;
    }

    public void manageProduction() {
        System.out.println(surname + " " + name + " is a new manager");
    }
}
