package com.splab.algorithms.jsonEx;


import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;

public class LikeJSON {

    public static void main(String[] args) {

        Man man = new Man();
        System.out.println(man);

        convertToJson(man);
        System.out.println(convertToJson(man));

        Set<Integer> intSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        List<LivingPlace> livingPlaces = new LinkedList<>();
        Map<String, Integer> stringDoubleMap = new HashMap<>(Map.of("first", 27, "Alex", 35));
        System.out.println("\n\n");
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

    public static String convertToJson(Object object) {
        StringBuilder jsonBuilder = new StringBuilder("{");

        for (Field field : object.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue;

            try {
                fieldValue = field.get(object);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                continue;
            }

            appendWithComma(jsonBuilder, "\"" + fieldName + "\":" + getFieldValueAsJson(fieldValue));
        }

        if (jsonBuilder.charAt(jsonBuilder.length() - 1) == ',') {
            jsonBuilder.setLength(jsonBuilder.length() - 1);
        }

        jsonBuilder.append("}");

        return jsonBuilder.toString();
    }

    private static void appendWithComma(StringBuilder builder, String value) {
        if (builder.length() > 1) {
            builder.append(",");
        }
        builder.append(value);
    }

    private static String getFieldValueAsJson(Object fieldValue) {
        if (fieldValue == null) {
            return "null";
        } else if (fieldValue.getClass().isArray()) {
            return convertArrayToJson(fieldValue);
        } else if (fieldValue instanceof Collection<?>) {
            return convertCollectionToJson((Collection<?>) fieldValue);
        } else if (fieldValue instanceof Map<?, ?>) {
            return convertMapToJson((Map<?, ?>) fieldValue);
        } else if (fieldValue.getClass().getName().startsWith("java.")) {
            return escapeString(fieldValue.toString());
        } else {
            return convertToJson(fieldValue);
        }
    }

    private static String convertCollectionToJson(Collection<?> collection) {
        StringBuilder arrayBuilder = new StringBuilder("[");
        for (Object item : collection) {
            arrayBuilder.append(getFieldValueAsJson(item)).append(",");
        }

        if (arrayBuilder.charAt(arrayBuilder.length() - 1) == ',') {
            arrayBuilder.setLength(arrayBuilder.length() - 1);
        }

        arrayBuilder.append("]");
        return arrayBuilder.toString();
    }

    private static String convertArrayToJson(Object array) {
        StringBuilder arrayBuilder = new StringBuilder("[");
        int length = Array.getLength(array);
        for (int i = 0; i < length; i++) {
            Object element = Array.get(array, i);
            arrayBuilder.append(getFieldValueAsJson(element)).append(",");
        }

        if (arrayBuilder.charAt(arrayBuilder.length() - 1) == ',') {
            arrayBuilder.setLength(arrayBuilder.length() - 1);
        }

        arrayBuilder.append("]");
        return arrayBuilder.toString();
    }

    private static String convertMapToJson(Map<?, ?> map) {
        StringBuilder mapBuilder = new StringBuilder("{");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            mapBuilder.append("\"").append(entry.getKey()).append("\":")
                    .append(getFieldValueAsJson(entry.getValue())).append(",");
        }

        if (mapBuilder.charAt(mapBuilder.length() - 1) == ',') {
            mapBuilder.setLength(mapBuilder.length() - 1);
        }

        mapBuilder.append("}");
        return mapBuilder.toString();
    }

    private static String escapeString(String input) {
        StringBuilder result = new StringBuilder("\"");
        for (char c : input.toCharArray()) {
            switch (c) {
                case '"' -> result.append("\\\"");
                case '\\' -> result.append("\\\\");
                case '\b' -> result.append("\\b");
                case '\f' -> result.append("\\f");
                case '\n' -> result.append("\\n");
                case '\r' -> result.append("\\r");
                case '\t' -> result.append("\\t");
                default -> result.append(c);
            }
        }
        result.append("\"");
        return result.toString();
    }
}
