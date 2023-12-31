package com.splab.javaCollections;

import com.splab.javaCollections.wildCards.Alex;
import com.splab.javaCollections.wildCards.Person;
import com.splab.javaCollections.wildCards.Vasyl;
import com.splab.patterns.behavioralPatterns.strategy.SortingStrategy;

import java.util.List;

public class Demonstration {
    public static void main(String[] args) {
        List<String> canChange = List.of("car", "End");
        System.out.println("list that we can change " + canChange);

        List<String> canNotChange = List.copyOf(canChange);
//        canNotChange.add("moto");




        AutoGenerics <String> auto = new AutoGenerics<>();
        auto.setValue("wheels");
        System.out.println(auto.getValue());


        Person first = new Alex(35);
        Person second = new Vasyl(29);
        showTheAgeOfPeople(List.of(first, second));




    }

    public static void showTheAgeOfPeople(List<? extends Person> people) {
        for (Person person : people) {
            person.showHowOld();
        }
    }
}
