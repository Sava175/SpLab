package com.splab.algorithms.jsonEx;

import lombok.Data;


import java.lang.reflect.Field;

public class LikeJSON2 {

    public static void main(String[] args) {
        Man man = new Man("Alex", 35, new Man.LivingPlace("any street", 5, "Odessa"));
        System.out.println(man);

        String json = convertToJson(man);
        System.out.println("JSON variant " + json);
    }



    public static String convertToJson(Object object) {
        StringBuilder jsonBuilder = new StringBuilder();
        convertObjectToJson(object, jsonBuilder);
        return jsonBuilder.toString();
    }

    private static void convertObjectToJson(Object object, StringBuilder jsonBuilder) {
        jsonBuilder.append("{");

        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            try {
                appendFieldToJson(field, object, jsonBuilder, fields);
            } catch (IllegalAccessException e) {
                handleFieldAccessException(e, field);
            }
        }

        removeTrailingComma(jsonBuilder);
        jsonBuilder.append("}");
    }

    private static void appendFieldToJson(Field field, Object object, StringBuilder jsonBuilder, Field[] fields) throws IllegalAccessException {
        Object fieldValue = field.get(object);
        jsonBuilder.append("\"").append(field.getName()).append("\":");

        if (field.getType().isPrimitive() || fieldValue == null || field.getType().equals(String.class)) {
            appendPrimitiveValueToJson(fieldValue, jsonBuilder);
        } else {
            convertObjectToJson(fieldValue, jsonBuilder);
        }

        addCommaIfNotLast(field, fields, jsonBuilder);
    }
    private static void appendPrimitiveValueToJson(Object value, StringBuilder jsonBuilder) {
        if (value == null) {
            jsonBuilder.append("null");
        } else if (value instanceof String) {
            jsonBuilder.append("\"").append(value).append("\"");
        } else {
            jsonBuilder.append(value);
        }
    }


    private static void handleFieldAccessException(IllegalAccessException e, Field field) {
        e.printStackTrace();
        throw new RuntimeException("can not get to the field " + field.getName(), e);
    }

    private static void addCommaIfNotLast(Field currentField, Field[] fields, StringBuilder jsonBuilder) {
        if (currentField != fields[fields.length - 1]) {
            jsonBuilder.append(",");
        }
    }

    private static void removeTrailingComma(StringBuilder jsonBuilder) {
        if (jsonBuilder.charAt(jsonBuilder.length() - 1) == ',') {
            jsonBuilder.deleteCharAt(jsonBuilder.length() - 1);
        }
    }



    @Data
    static class Man {
        private String name;
        private int age;
        private LivingPlace livingPlace;

        public Man(String name, int age, LivingPlace livingPlace) {
            this.name = name;
            this.age = age;
            this.livingPlace = livingPlace;
        }

        @Data
        static class LivingPlace {
            private String streetName;
            private int streetNumber;
            private String city;

            public LivingPlace(String streetName, int streetNumber, String city) {
                this.streetName = streetName;
                this.streetNumber = streetNumber;
                this.city = city;
            }
        }
    }
}
