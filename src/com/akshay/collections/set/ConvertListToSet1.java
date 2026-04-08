package com.akshay.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,50,80,70,60,20,50);

        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}
