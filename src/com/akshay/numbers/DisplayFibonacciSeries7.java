package com.akshay.numbers;

import java.util.Scanner;

public class DisplayFibonacciSeries7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();      //  20

        int prev = 0;
        int next = 1;

        System.out.println(prev+"\n"+next);


        int fib;
        for(int i=1;i<num;i++){
            fib = prev + next;
            prev = next;
            next = fib;
            System.out.println(fib);
        }
    }
}
