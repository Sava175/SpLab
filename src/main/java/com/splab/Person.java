package com.splab;


import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
    public static void main(String[] args) {

        HashMap<Person, String> personMap = new HashMap<>();

        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        personMap.put(person1, "Student 1");
        personMap.put(person2, "Student 2");

        Person anotherPerson = new Person("Charlie", 22);
        String value = personMap.get(anotherPerson);
        System.out.println("Value for anotherPerson: " + value);




        int intValue = 101;
        double doubleValue = 101.3;


        String stringValue = "Hello";
        Object objectValue = new Object();
        int[] arrayValue = {1, 2, 3};
        List<String> listValue = new ArrayList<>();



    }
}
