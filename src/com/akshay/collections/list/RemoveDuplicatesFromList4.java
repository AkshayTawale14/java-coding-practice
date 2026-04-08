package com.akshay.collections.list;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList4 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,20,40,30,50,90);

        Set<Integer> set = new LinkedHashSet<>(list);

        System.out.println("set elements are :"+set);
    }
}
