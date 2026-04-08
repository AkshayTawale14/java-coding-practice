package com.akshay.java8;

@FunctionalInterface
interface Calculater{

     int add(int a, int b);
}

public class AddMethod1 {

    public static void main(String[] args) {

        // Interface implementation using anonymous class
        Calculater calculater = new Calculater() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };

        int result = calculater.add(10, 30);
        System.out.println(result);


        Calculater sum1 = (a, b) -> a+b;
        System.out.println(sum1.add(50, 100));


    }
}
