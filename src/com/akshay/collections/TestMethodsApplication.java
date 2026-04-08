package com.akshay.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestMethodsApplication {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Akash");
        list.add("Ganesh");
        list.add("ram");
        list.add("shyam");

        List<String> names = new LinkedList<>();
        names.addAll(list);

        if(list.isEmpty()){
            System.out.println("List is empty");
        }
        else {
            System.out.println("list is not empty");
        }
    }
}
