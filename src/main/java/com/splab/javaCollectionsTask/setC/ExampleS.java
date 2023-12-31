package com.splab.javaCollectionsTask.setC;

import lombok.Data;

import java.util.*;

@Data
public class ExampleS {
    public static void main(String[] args) {
        Set <String> stringSet = new HashSet<>();
        stringSet.add("Vasyl");
        stringSet.add("Vasyl");
        stringSet.add("Vasyl");
        System.out.println(stringSet);
        stringSet.remove("Vasyl");
        System.out.println(stringSet);
        stringSet.add("Vasyl");
        stringSet.add("Alex");
        stringSet.add("Denis");
        System.out.println(stringSet);
        System.out.println(stringSet.contains("Alex"));
        // --------



        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Alex");
        linkedHashSet.add("Vasyl");
        linkedHashSet.add("Petya");
        System.out.println(linkedHashSet);
        // --------






        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("Alex");
        stringTreeSet.add("Vasyl");
        stringTreeSet.add("Den");
        System.out.println("first " + stringTreeSet);


        TreeSet<Person> personTreeSetAge = new TreeSet<>();
        personTreeSetAge.add(new Person("Alex", 35));
        personTreeSetAge.add(new Person("Vasyl", 27));
        personTreeSetAge.add(new Person("Den", 34));
        System.out.println("second " + personTreeSetAge);
        // automatically compare by implementing method from Comparable


        TreeSet<Person> personTreeSetReversed = new TreeSet<>(Comparator.comparingInt((Person person) -> person.age).reversed());
        personTreeSetReversed.add(new Person("Alex", 34));
        personTreeSetReversed.add(new Person("Vasyl", 56));
        personTreeSetReversed.add(new Person("Den", 23));
        System.out.println("Here works comparators method comparingInt " + personTreeSetReversed);


        TreeSet<Person> people = new TreeSet<>(Person.getComparatorByName());
        people.add(new Person("Q", 37));
        people.add(new Person("G", 30));
        people.add(new Person("A", 22));
        System.out.println("Here works method that i created for compare " + people);



    }
    @Data
    static class Person implements Comparable<Person> {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person some) {
                return Integer.compare(this.age, some.age);
        }

        public static Comparator<Person> getComparatorByName() {
            return Comparator.comparing(Person::getName);
        }
    }
}
