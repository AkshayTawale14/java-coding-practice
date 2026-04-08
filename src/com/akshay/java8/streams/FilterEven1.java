package com.akshay.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEven1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,11,13,14,15,16,17,19,20);

        List<Integer> even = list.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> squares = list.stream().map(n-> n*n).collect(Collectors.toList());
        System.out.println(squares);

        List<String> names = Arrays.asList("Amit", "Anita", "Rahul", "Arjun", "Neha", "Asha");

        char startLetter = 'A';

        long count = names.stream().filter(name -> name.toUpperCase().charAt(0)==Character.toUpperCase(startLetter)).count();
        System.out.println("Count : " +count);

        names.stream().forEach(name-> System.out.println(name));



    }
}
