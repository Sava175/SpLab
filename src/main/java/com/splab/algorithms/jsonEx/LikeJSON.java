package com.splab.algorithms.jsonEx;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class LikeJSON {

    public static void main(String[] args) {
        Person vasyl = new Person();
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = new Person("Alex", 35, new Address("any street", 5, "Odessa"));
        try {

            String json = objectMapper.writeValueAsString(person);
            System.out.println("JSON line " + json);

            Person transformedPerson = objectMapper.readValue(json, Person.class);
            System.out.println("transformed person " + transformedPerson);

            System.out.println(transformedPerson.age);
            System.out.println(transformedPerson);

            vasyl.setName(transformedPerson.getName());
            vasyl.setAge(transformedPerson.getAge());
            vasyl.setAddress(transformedPerson.getAddress());

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("outside try " + vasyl);

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Person{
        private String name;
        private int age;
        private Address address;

    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Address{
        private String streetName;
        private int streetNumber;
        private String city;
    }
}
