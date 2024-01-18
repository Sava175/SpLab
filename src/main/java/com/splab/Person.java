package com.splab;


import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import lombok.Data;

import java.util.*;

@Data
public class Person {

    public static void main(String[] args) {


        ImmutableList<Integer> immutableList = ImmutableList.of(1, 2, 3);
        ImmutableSet<String> immutableSet = ImmutableSet.of("Alex", "Vasyl", "Dmitry");
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("Vasyl", 27, "Alex", 35);


        List<Integer> useListOf = List.of(1, 2, 3);
        Set<String> useSetOf = Set.of("Alex", "Vasyl", "Dmitry");
        Map<String, Integer> useMapOf = Map.of("Vasyl", 27, "Alex", 35);

        List<Integer> toMakeUnmodeList = Arrays.asList(1, 2, 3);
        toMakeUnmodeList.add(0, 2);
        List<Integer> unmodifiableList = Collections.unmodifiableList(toMakeUnmodeList);
        unmodifiableList.add(0,3); // does not work. Give UnsupportedOperationException

        Set<String> toMakeUnmodeSet = new HashSet<>(Arrays.asList("Alex", "Vasyl", "Dmitry"));
        Set<String> set = Collections.unmodifiableSet(toMakeUnmodeSet);

        Map<String, Integer> toMakeUnmodeMap = new HashMap<>();
        toMakeUnmodeMap.put("Vasyl", 27);
        toMakeUnmodeMap.put("Alex", 35);
        Map<String, Integer> map = Collections.unmodifiableMap(toMakeUnmodeMap);

        List<Integer> useCopyOfList = List.copyOf(Arrays.asList(1, 2, 3));
        Set<String> useCopyOfSet = Set.copyOf(new HashSet<>(Arrays.asList("Alex", "Vasyl", "Dmitry")));
        Map<String, Integer> useCopyOfMap = Map.copyOf(new HashMap<>(Map.of("Vasyl", 27, "Alex", 35)));

        useCopyOfList.add(0, 2);  // does not work. Give UnsupportedOperationException





    }
}
