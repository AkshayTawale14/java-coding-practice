package com.akshay.basics;

public class CheckGreaterNumber {

    public static void main(String[] args) {

        int a = 20, b = 60, c = 40;

        if(a>b && a>c){
            System.out.println("A is greatest");
        } else if (b>a && b>c) {
            System.out.println("B is greatest of all");
        }
        else {
            System.out.println("C is greatest ");
        }

        int max = (a>b) ? a : b;
        System.out.println(max);

        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);  // Output: Even
    }
}
