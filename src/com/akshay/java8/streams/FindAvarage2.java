package com.akshay.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindAvarage2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 6, 8, 10, 18, 36, 8, 10);

        Integer max_val = list.stream()
                .max(Integer::compare)   // .max(Integer::compare) compares elements and returns the biggest one.
                .orElse(null);

        // Find the minimum value
        Integer min_val = list.stream()
                .min(Integer::compare)
                .orElse(null);

        System.out.println("\nMaximum value of the said list: " + max_val);
        System.out.println("\nMinimum value of the said list: " + min_val);

        double average = list.stream()
                .mapToDouble(Integer::doubleValue).average().orElse(0.0 );

        System.out.println("________ "+average);

        int sumOfEvens = list.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumOfOdds = list.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of odd numbers: " + sumOfOdds);

        //Remove duplicates from list using streams
        List<Integer> duplicates = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Duplicates "+duplicates);


        System.out.println("SumOfEvens--------"+sumOfEvens);

        List<String> names = Arrays.asList("Amit", "Anita", "Rahul", "Arjun", "Neha", "Asha");
        List<String> upperNames = names.stream().map(name->name.toUpperCase()).toList();
        System.out.println(upperNames);

        List<String> namesStartWith = names.stream().filter(name->name.toUpperCase().startsWith("A")).collect(Collectors.toList());
        System.out.println(namesStartWith);
        long ctr = names.stream().filter(name->name.startsWith("A")).count();
        System.out.println(ctr);

        List < String > ascendingOrder = names.stream()
                .sorted()
                .collect(Collectors.toList());

        // Sort strings in descending order
        List < String > descendingOrder = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("\nSorted in Ascending Order: " + ascendingOrder);
        System.out.println("\nSorted in Descending Order: " + descendingOrder);



    }
}
