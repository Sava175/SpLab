package com.splab.algorithms.navigator.dijkstra;

import lombok.Data;

import java.util.*;

@Data
public class Dijkstra {
    private PriorityQueue<Vertex> queue;

    public Dijkstra(){
        queue = new PriorityQueue<>();

    }

    public void compute(Vertex source){
        source.setDistance(0);
        queue.add(source);

        while (!queue.isEmpty()){
            Vertex curr = queue.poll();

            for (Edge e: curr.getNeighbours()){
                Vertex end = e.getEnd();
                int w = e.getWeight();

                if (!end.isVisited()) {
                    if (curr.getDistance() + w < end.getDistance()) {
                        queue.remove(end);
                        end.setDistance(curr.getDistance() + w);
                        end.setPredecessor(curr);
                        queue.add(end);
                    }
                }

            }
            curr.setVisited(true);
        }
    }
    public void showPass(Vertex end){
        List<Vertex> path = new ArrayList<>();
        while (end != null){
            path.add(end);
            end = end.getPredecessor();
        }
        Collections.reverse(path);
        for(Vertex e: path){
            System.out.println(e.getName());
        }
    }
}
