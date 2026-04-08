package com.akshay.collections.map;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap1 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Akshay");
        map.put(102, "Priya");
        map.put(103, "Rohan");
        map.put(104, "Sneha");
        map.put(105, "Vikram");

        for(Map.Entry<Integer, String> entry : map.entrySet()){                         // Map.Entry(Integer,String) entry : map.entrySet()

            System.out.println(entry.getKey()+" - "+entry.getValue());

            System.out.println();
            // Using keySet
            for(Integer key : map.keySet()){
                System.out.println(key + " " + map.get(key));
            }


        }

    }
}
