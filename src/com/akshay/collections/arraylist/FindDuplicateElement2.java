package com.akshay.collections.arraylist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElement2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50,20,40,70);

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : list){

            if(!set.add(num)){            // // add() returns false → duplicate found!
                duplicates.add(num);

            }
        }

        System.out.println("set : "+set);
        System.out.println("Duplicates : "+duplicates);


    }
}
