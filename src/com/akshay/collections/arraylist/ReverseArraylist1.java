package com.akshay.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist1 {

    public static void main(String[] args) {

        ArrayList <Integer>list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Collections.reverse(list);

        for(int value : list){
            System.out.println(value);
        }



    }
}
