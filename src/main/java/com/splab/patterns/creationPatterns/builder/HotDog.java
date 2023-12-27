package com.splab.patterns.creationPatterns.builder;

import lombok.Data;


@Data
public class HotDog {
    private String bun;
    private String side;
    private String toAdd;
    private int cost;

    public HotDog(String bun, String side, String toAdd, int cost) {
        this.bun = bun;
        this.side = side;
        this.toAdd = toAdd;
        this.cost = cost;
    }


    public static class FoodBuilder{

        private String bun;
        private String side;
        private String toAdd;
        private int cost;
        public FoodBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public FoodBuilder setSide(String side) {
            this.side = side;
            return this;
        }

        public FoodBuilder setToAdd(String toAdd) {
            this.toAdd = toAdd;
            return this;
        }

        public FoodBuilder setCost(int cost) {
            this.cost = cost;
            return this;
        }

        public HotDog build() {
            return new HotDog(bun, side, toAdd, cost);
        }
    }

}



