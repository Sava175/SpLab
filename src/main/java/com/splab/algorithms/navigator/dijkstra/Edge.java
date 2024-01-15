package com.splab.algorithms.navigator.dijkstra;

import lombok.Data;

@Data
public class Edge {
    private Vertex start;
    private Vertex end;
    private int weight;

    public Edge(Vertex start, Vertex end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
}
