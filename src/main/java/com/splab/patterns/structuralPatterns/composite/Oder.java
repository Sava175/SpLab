package com.splab.patterns.structuralPatterns.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Oder implements Component {
    private List<Component> components;

    @Override
    public void showComponent() {
        for(Component component: components){
            component.showComponent();
        }
    }
}
