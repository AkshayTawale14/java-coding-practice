package com.akshay.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxMinFromList5 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(100,750,300,200,400,350,50,90);

        int minValue = Collections.min(list);
        int maxValue = Collections.max(list);

        System.out.println("Min value : "+minValue);
        System.out.println("Max = "+maxValue);
    }
}
