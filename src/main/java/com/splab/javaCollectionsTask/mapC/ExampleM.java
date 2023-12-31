package com.splab.javaCollectionsTask.mapC;

import com.splab.javaCollectionsTask.setC.ExampleS;
import lombok.Data;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExampleM {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alex", 35);
        hashMap.put("Vasyl", 27);
        hashMap.put("Den", 34);
        System.out.println("Age of Alex is " + hashMap.get("Alex"));

        for (Map.Entry<String, Integer> friends : hashMap.entrySet()) {
            System.out.println(friends.getKey() + " " + friends.getValue());
        }

        Map<String, Integer> checkComparator = new TreeMap<>(new SelfMadeTreeMap());
        checkComparator.put("Vasyl", 27);
        checkComparator.put("Den", 34);
        checkComparator.put("Alex", 35);

        System.out.println("\nwith comparator:");
        for (Map.Entry<String, Integer> checkC:checkComparator.entrySet()){
            System.out.println(checkC.getKey() + " " + checkC.getValue());
        }

        // all the same with LinkedHashMap but in ordnung


//        .containsValue();
//        .keySet();
//        .values();
//        .remove("Bob");
//        .size();
//        .clear();




    }

    static class SelfMadeTreeMap implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return str1.compareTo(str2);
        }
    }


}
