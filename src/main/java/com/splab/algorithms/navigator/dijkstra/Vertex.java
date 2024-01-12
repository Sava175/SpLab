package com.splab.algorithms.navigator.dijkstra;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Vertex implements Comparable<Vertex> {
    private String name;
    private boolean visited;
    private List<Edge> neighbours;
    private int distance;
    private Vertex predecessor;

    public Vertex(String name){
        this.name = name;
        neighbours = new ArrayList<>();
        this.distance = Integer.MAX_VALUE;
        this.predecessor = null;
    }
    public void addNeighbour(Edge e){
        neighbours.add(e);
    }

    @Override
    public int compareTo(Vertex o) {
        return Integer.compare(this.getDistance(), o.getDistance());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Edge> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Edge> neighbours) {
        this.neighbours = neighbours;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        List<String> neighbourNames = neighbours.stream()
                .map(edge -> edge.getEnd().getName())
                .collect(Collectors.toList());

        return "Vertex{" +
                "name='" + name + '\'' +
                ", visited=" + visited +
                ", neighbourNames=" + neighbourNames +
                ", distance=" + distance +
                ", predecessor=" + (predecessor != null ? predecessor.getName() : null) +
                '}';
    }

}
