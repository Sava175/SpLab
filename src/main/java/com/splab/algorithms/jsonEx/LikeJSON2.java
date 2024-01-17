package com.splab.algorithms.jsonEx;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.lang.reflect.Field;
import java.util.*;

public class LikeJSON2 {

    public static void main(String[] args) {

        Man man = new Man();
        System.out.println(man);
        Set<Integer> intSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        List<LivingPlace> livingPlaces = new LinkedList<>();
        Map<String, Integer> stringDoubleMap = new HashMap<>(Map.of("first", 27, "Alex", 35));
        System.out.println(convertMapToJson(stringDoubleMap));

        man.setName("John");
        man.setAge(30);
        livingPlaces.add(new LivingPlace("any street", 7, "Odessa"));
        livingPlaces.add(new LivingPlace("any other street", 9, "Odessa is good"));
        man.setLivingPlace(livingPlaces);
        man.setIntegerSet(intSet);
        man.setBills(new HashSet<>(Arrays.asList(123, 456)));
        man.setPeoples(Map.of("Vasyl", 27, "Alex", 35));
        man.setPhones(Arrays.asList(123456789, 987654321));

        String json = convertToJson(man);
        System.out.println(json);
    }


    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    static class Man {
        private String name;
        private int age;
        private List<LivingPlace> livingPlace;
        private Set<Integer> bills;
        private Map<String, Integer> peoples;
        private List<Integer>phones;
        private Set<Integer> integerSet;

    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    static class LivingPlace {
        private String streetName;
        private int streetNumber;
        private String city;
    }

    public static String convertToJson(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder jsonBuilder = new StringBuilder("{");

        for (Field field : fields) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue;

            try {
                fieldValue = field.get(object);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                continue;
            }
            jsonBuilder.append("\"").append(fieldName).append("\":");

            if (fieldValue == null) {
                jsonBuilder.append("null");
            } else {
                jsonBuilder.append(getFieldValueAsJson(field.getType(), fieldValue));
            }
            jsonBuilder.append(",");
        }

        if (jsonBuilder.charAt(jsonBuilder.length() - 1) == ',') {
            jsonBuilder.setLength(jsonBuilder.length() - 1);
        }

        jsonBuilder.append("}");

        return jsonBuilder.toString();
    }

    private static String getFieldValueAsJson(Class<?> fieldType, Object fieldValue) {
        if (fieldType.isAssignableFrom(Collection.class)) {
            return convertCollectionToJson((Collection<?>) fieldValue);
        } else if (fieldType.isArray()) {
            return convertArrayToJson(fieldValue);
        } else if (fieldType.isAssignableFrom(Map.class)) {
            return convertMapToJson((Map<?, ?>) fieldValue);
        } else {
            return "\"" + fieldValue.toString() + "\"";
        }
    }

    private static String convertCollectionToJson(Collection<?> collection) {
        StringBuilder arrayBuilder = new StringBuilder("[");
        for (Object item : collection) {
            arrayBuilder.append("\"").append(item.toString()).append("\",");
        }

        if (arrayBuilder.charAt(arrayBuilder.length() - 1) == ',') {
            arrayBuilder.setLength(arrayBuilder.length() - 1);
        }

        arrayBuilder.append("]");
        return arrayBuilder.toString();
    }

    private static String convertArrayToJson(Object array) {
        return convertCollectionToJson(Arrays.asList((Object[]) array));
    }

    private static String convertMapToJson(Map<?, ?> map) {
        StringBuilder mapBuilder = new StringBuilder("{");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            mapBuilder.append("\"").append(entry.getKey().toString()).append("\":\"").append(entry.getValue().toString()).append("\",");
        }

        if (mapBuilder.charAt(mapBuilder.length() - 1) == ',') {
            mapBuilder.setLength(mapBuilder.length() - 1);
        }

        mapBuilder.append("}");
        return mapBuilder.toString();
    }
}
