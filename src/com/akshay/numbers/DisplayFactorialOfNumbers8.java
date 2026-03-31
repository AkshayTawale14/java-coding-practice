package com.akshay.numbers;

import java.util.Scanner;

public class DisplayFactorialOfNumbers8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();      //  20

        int fact = 1;
        System.out.println("Fcatoral of the numbers are :");
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
