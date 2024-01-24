package com.splab.algorithms.jsonEx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Man {
        private String name;
        private int age;
        private List<LivingPlace> livingPlace;
        private Set<Integer> bills;
        private Map<String, Integer> peoples;
        private List<Integer>phones;
        private Set<Integer> integerSet;
}
