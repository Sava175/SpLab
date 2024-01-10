package com.splab.algorithms.navigator;

import lombok.Data;

import java.util.*;


// я имею и плачу эту передачу(( я нифига не понимаю уже второй день. Вернусь к этому заданию позже
@Data
public class ShortestPathFinder {
    private Map<String, Map<String, Integer>> graph;

    public ShortestPathFinder() {
        graph = new HashMap<>();
    }

    public void addCity(String city) {
        graph.put(city, new HashMap<>());
    }

    public void addRoad(String city1, String city2, int distance) {
        graph.get(city1).put(city2, distance);
        graph.get(city2).put(city1, distance);
    }

    public List<String> findShortestPath(String startCity, String endCity) {
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previousCities = new HashMap<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(distances::get));
        // будет проходить сортировка при добавлении в priorityQueue на основе integer в Map distances

//           ключи     значения
//        Map<String, Map<String, Integer>> graph;
        for (String city : graph.keySet()) {    // получаем с графа ключи "названия городов"
            if (city.equals(startCity)) {       // по его значениям Map<String, Integer>
                distances.put(city, 0);
            } else {
                distances.put(city, Integer.MAX_VALUE);
            }
            priorityQueue.add(city);
        }

//                                                                      ключи        значения
//                                                                  Map<String, Map<String, Integer>> graph;
        //                                                            String some =     graph.getKey
        //                                                            int some =        graph.getValue
        while (!priorityQueue.isEmpty()) {
            String currentCity = priorityQueue.poll();

//               ключи        значения
//            Map<String, Map<String, Integer>> graph;
//                                                        получить по ключу
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

    public static void main(String[] args) {
        ShortestPathFinder pathFinder = new ShortestPathFinder();


        pathFinder.addCity("A");
        pathFinder.addCity("B");
        pathFinder.addCity("C");


        pathFinder.addRoad("A", "B", 2);
        pathFinder.addRoad("B", "C", 3);
        pathFinder.addRoad("A", "C", 5);


        String startCity = "A";
        String endCity = "C";


        List<String> shortestPath = pathFinder.findShortestPath(startCity, endCity);


        System.out.println("Shortest Path from " + startCity + " to " + endCity + ": " + shortestPath);
        System.out.println("Total Distance: " + pathFinder.calculateTotalDistance(shortestPath));
    }
}
