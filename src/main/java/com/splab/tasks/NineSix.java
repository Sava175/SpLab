package com.splab.tasks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

public class NineSix {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int personalNumber = random.nextInt(100);
            String firstName = "User" + i;
            String lastName = "LastName" + i;
            int age = random.nextInt(30) + 20;

            users.add(new User(personalNumber, firstName, lastName, age));
        }

        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("\n");
        Collections.sort(users);
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("\n");
        users.sort(Comparator.comparingInt(User::getAge));
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("\n");
        NameComparator nameComparator = new NameComparator();
        users.sort(nameComparator);
        for (User user : users) {
            System.out.println(user);
        }

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class User implements Comparable<User>{
        private int personalNumber;
        private String name;
        private String surname;
        private int age;

        @Override
        public int compareTo(User user) {
            return Integer.compare(this.personalNumber, user.personalNumber);
        }
        }

    public static class NameComparator implements Comparator<User> {
        @Override
        public int compare(User first, User second) {
            return first.getName().compareTo(second.getName());
        }
    }
}

