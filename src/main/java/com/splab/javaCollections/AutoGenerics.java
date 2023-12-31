package com.splab.javaCollections;

public class AutoGenerics<W>{
    private W part;

    public W getValue() {
        return part;
    }

    public void setValue(W value) {
        this.part = value;
    }

}
