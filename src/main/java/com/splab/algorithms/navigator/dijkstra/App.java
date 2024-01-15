package com.splab.algorithms.navigator.dijkstra;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Dijkstra dijkstra = new Dijkstra();
        List<Vertex> vertices = generateVertices();
        generateRoads(vertices);


        Vertex startVertex = findVertexByName(vertices, "Odessa");
        Vertex endVertex = findVertexByName(vertices, "Lviv");
        dijkstra.compute(startVertex);
        System.out.println(endVertex.getDistance());
        dijkstra.showPass(endVertex);

    }
    public static List<Vertex> generateVertices() {
        List<Vertex> vertices = new ArrayList<>();

        vertices.add(new Vertex("Odessa"));
        vertices.add(new Vertex("Nikolaev"));
        vertices.add(new Vertex("Kherson"));
        vertices.add(new Vertex("Krivoy Rog"));
        vertices.add(new Vertex("Kropivnitsky"));
        vertices.add(new Vertex("Uman"));
        vertices.add(new Vertex("Vinnitsa"));
        vertices.add(new Vertex("Kyiv"));
        vertices.add(new Vertex("Gutomir"));
        vertices.add(new Vertex("Khmelnitsky"));
        vertices.add(new Vertex("Rivne"));
        vertices.add(new Vertex("Ternopol"));
        vertices.add(new Vertex("Lviv"));
        vertices.add(new Vertex("Poltava"));
        vertices.add(new Vertex("Symu"));
        vertices.add(new Vertex("Kharkiv"));
        vertices.add(new Vertex("Dnepr"));
        return vertices;
    }

    public static void generateRoads(List<Vertex> vertices) {
        vertices.get(0).addNeighbour(new Edge(vertices.get(0), vertices.get(1), 132));
        vertices.get(0).addNeighbour(new Edge(vertices.get(0), vertices.get(5), 271));
        vertices.get(1).addNeighbour(new Edge(vertices.get(1), vertices.get(0), 132));
        vertices.get(1).addNeighbour(new Edge(vertices.get(1), vertices.get(2), 71));
        vertices.get(1).addNeighbour(new Edge(vertices.get(1), vertices.get(3), 204));
        vertices.get(2).addNeighbour(new Edge(vertices.get(2), vertices.get(1), 71));
        vertices.get(3).addNeighbour(new Edge(vertices.get(3), vertices.get(1), 204));
        vertices.get(3).addNeighbour(new Edge(vertices.get(3), vertices.get(16), 146));
        vertices.get(3).addNeighbour(new Edge(vertices.get(3), vertices.get(4), 119));
        vertices.get(4).addNeighbour(new Edge(vertices.get(4), vertices.get(5), 167));
        vertices.get(4).addNeighbour(new Edge(vertices.get(4), vertices.get(16), 245));
        vertices.get(4).addNeighbour(new Edge(vertices.get(4), vertices.get(3), 119));
        vertices.get(5).addNeighbour(new Edge(vertices.get(5), vertices.get(0), 271));
        vertices.get(5).addNeighbour(new Edge(vertices.get(5), vertices.get(7), 212));
        vertices.get(5).addNeighbour(new Edge(vertices.get(5), vertices.get(6), 160));
        vertices.get(5).addNeighbour(new Edge(vertices.get(5), vertices.get(4), 167));
        vertices.get(6).addNeighbour(new Edge(vertices.get(6), vertices.get(5), 160));
        vertices.get(6).addNeighbour(new Edge(vertices.get(6), vertices.get(9), 122));
        vertices.get(7).addNeighbour(new Edge(vertices.get(7), vertices.get(5), 212));
        vertices.get(7).addNeighbour(new Edge(vertices.get(7), vertices.get(13), 342));
        vertices.get(7).addNeighbour(new Edge(vertices.get(7), vertices.get(8), 140));
        vertices.get(8).addNeighbour(new Edge(vertices.get(8), vertices.get(7), 140));
        vertices.get(8).addNeighbour(new Edge(vertices.get(8), vertices.get(11), 188));
        vertices.get(9).addNeighbour(new Edge(vertices.get(9), vertices.get(10), 111));
        vertices.get(9).addNeighbour(new Edge(vertices.get(9), vertices.get(6), 122));
        vertices.get(10).addNeighbour(new Edge(vertices.get(10), vertices.get(11), 159));
        vertices.get(10).addNeighbour(new Edge(vertices.get(10), vertices.get(8), 188));
        vertices.get(10).addNeighbour(new Edge(vertices.get(10), vertices.get(12), 121));
        vertices.get(11).addNeighbour(new Edge(vertices.get(11), vertices.get(10), 159));
        vertices.get(11).addNeighbour(new Edge(vertices.get(11), vertices.get(12), 127));
        vertices.get(11).addNeighbour(new Edge(vertices.get(11), vertices.get(9), 111));
        vertices.get(12).addNeighbour(new Edge(vertices.get(12), vertices.get(10), 121));
        vertices.get(12).addNeighbour(new Edge(vertices.get(12), vertices.get(11), 127));
        vertices.get(13).addNeighbour(new Edge(vertices.get(13), vertices.get(7), 342));
        vertices.get(13).addNeighbour(new Edge(vertices.get(13), vertices.get(14), 143));
        vertices.get(14).addNeighbour(new Edge(vertices.get(14), vertices.get(13), 143));
        vertices.get(14).addNeighbour(new Edge(vertices.get(14), vertices.get(15), 183));
        vertices.get(15).addNeighbour(new Edge(vertices.get(15), vertices.get(14), 183));
        vertices.get(15).addNeighbour(new Edge(vertices.get(15), vertices.get(13), 143));
        vertices.get(15).addNeighbour(new Edge(vertices.get(15), vertices.get(16), 216));
        vertices.get(16).addNeighbour(new Edge(vertices.get(16), vertices.get(15), 216));
        vertices.get(16).addNeighbour(new Edge(vertices.get(16), vertices.get(3), 146));
        vertices.get(16).addNeighbour(new Edge(vertices.get(16), vertices.get(4), 245));
    }

    public static Vertex findVertexByName(List<Vertex> vertices, String cityName) {
        for (Vertex vertex : vertices) {
            if (vertex.getName().equals(cityName)) {
                return vertex;
            }
        }
        return null;
    }

}
