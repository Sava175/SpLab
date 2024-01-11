package com.splab.algorithms.navigator;

import lombok.Data;
import java.util.*;

@Data
public class ShortestPathFinder {
    private Map<String, Map<String, Integer>> graph;

    public ShortestPathFinder() {
        graph = new HashMap<>();
    }

    public static void main(String[] args) {
        ShortestPathFinder pathFinder = new ShortestPathFinder();
        initializeCities(pathFinder);
        initializeRoads(pathFinder);

        String fromCity = "Odessa";
        String toCity = "Kyiv";
        List<String> shortestPath = pathFinder.findShortestPath(fromCity, toCity);

        System.out.println("Shortest Path from " + fromCity + " to " + toCity + ": " + shortestPath);
        System.out.println("Total Distance: " + pathFinder.calculateTotalDistance(shortestPath));
    }





    private static void initializeCities(ShortestPathFinder pathFinder) {
        String[] cities = {"Odessa", "Nikolaev", "Kherson", "Krivoy Rog", "Kropivnitsky",
                "Uman", "Vinnitsa", "Kyiv", "Gutomir", "Khmelnitsky",
                "Rivne", "Ternopol", "Lviv", "Poltava", "Symu", "Kharkiv", "Dnepr"};

        for (String city : cities) {
            pathFinder.addCity(city);
        }
    }

    private static void initializeRoads(ShortestPathFinder pathFinder) {
        pathFinder.addRoad("Odessa", "Nikolaev", 132);
        pathFinder.addRoad("Odessa", "Uman", 271);
        pathFinder.addRoad("Nikolaev", "Kherson", 71);
        pathFinder.addRoad("Nikolaev", "Krivoy Rog", 204);
        pathFinder.addRoad("Krivoy Rog", "Dnepr", 146);
        pathFinder.addRoad("Dnepr", "Kharkiv", 216);
        pathFinder.addRoad("Kharkiv", "Symu", 183);
        pathFinder.addRoad("Kharkiv", "Poltava", 143);
        pathFinder.addRoad("Kyiv", "Poltava", 342);
        pathFinder.addRoad("Kyiv", "Uman", 212);
        pathFinder.addRoad("Kyiv", "Gutomir", 140);
        pathFinder.addRoad("Gutomir", "Rivne", 188);
        pathFinder.addRoad("Lviv", "Rivne", 121);
        pathFinder.addRoad("Lviv", "Ternopol", 127);
        pathFinder.addRoad("Khmelnitsky", "Ternopol", 111);
        pathFinder.addRoad("Rivne", "Ternopol", 159);
        pathFinder.addRoad("Khmelnitsky", "Vinnitsa", 122);
        pathFinder.addRoad("Uman", "Vinnitsa", 160);
        pathFinder.addRoad("Uman", "Kropivnitsky", 167);
        pathFinder.addRoad("Dnepr", "Kropivnitsky", 245);
        pathFinder.addRoad("Krivoy Rog", "Kropivnitsky", 119);
    }

    public void addCity(String city) {
        graph.put(city, new HashMap<>());
    }

    public void addRoad(String fromCity, String toCity, int distance) {
        graph.get(fromCity).put(toCity, distance);
        graph.get(toCity).put(fromCity, distance);
    }

    public List<String> findShortestPath(String startCity, String endCity) {
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previousCities = new HashMap<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (String city : graph.keySet()) {
            if (city.equals(startCity)) {
                distances.put(city, 0);
            } else {
                distances.put(city, Integer.MAX_VALUE);
            }
            priorityQueue.add(city);
        }
        System.out.println(priorityQueue);


        while (!priorityQueue.isEmpty()) {
            String currentCity = priorityQueue.poll();

            for (Map.Entry<String, Integer> neighbor : graph.get(currentCity).entrySet()) {
                int newDistance = distances.get(currentCity) + neighbor.getValue();
                if (newDistance < distances.get(neighbor.getKey())) {
                    distances.put(neighbor.getKey(), newDistance);
                    previousCities.put(neighbor.getKey(), currentCity);
                    priorityQueue.remove(neighbor.getKey());
                    priorityQueue.add(neighbor.getKey());
                }
            }
        }

        List<String> path = new ArrayList<>();
        String current = endCity;
        while (current != null) {
            path.add(current);
            current = previousCities.get(current);
        }
        Collections.reverse(path);

        return path;
    }

    public int calculateTotalDistance(List<String> path) {
        int totalDistance = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            totalDistance += graph.get(path.get(i)).get(path.get(i + 1));
        }
        return totalDistance;
    }
}
