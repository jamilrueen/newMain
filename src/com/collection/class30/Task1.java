package com.collection.class30;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map  Building =new HashMap();
        Building.put(1, "Jamil");
        Building.put(2, "Jamshid");
        Building.put(3, "Hashmat");

        System.out.println(Building);
        System.out.println(Building.size());
        System.out.println(Building.get(3));
        System.out.println(Building.containsValue("Jamil"));
        System.out.println(Building);

    }
    }
