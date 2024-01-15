package com.splab.javaCollectionsTask.listC;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
public class ExampleL {
    public static void main(String[] args) {
        List<Object> objectArrayList = new ArrayList<>();
        objectArrayList.add("avyb");
        objectArrayList.add(2);
        objectArrayList.add("sssvvsv");
        objectArrayList.add(1, 5);
        ExampleL any = new ExampleL();
        objectArrayList.add(any);
        System.out.println(objectArrayList.contains(5));
        System.out.println(objectArrayList);
        // arrayList example


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Vasyl");
        linkedList.add("Vasyl2");
        linkedList.addLast("Vasyl3");
        System.out.println(linkedList);
        System.out.println(linkedList.contains("Vasyl2"));
        linkedList.add(1,"Vasyl4");
        linkedList.remove("Vasyl4");


        System.out.println(linkedList.pop()); // look and then remove   from old Stack
        System.out.println(linkedList.peek()); // Vasyl2                ----#--
        System.out.println(linkedList.isEmpty()); // false              ----#--
        // using linkedList. Vector = arrayList


    }
}
