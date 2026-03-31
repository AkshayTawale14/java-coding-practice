package com.akshay.basics;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("Negative number cannot have factorials ");
        }

        if(n==0){
            System.out.println("factorial of 0 is : "+1);
        }

        int fact = 1;
        while(n!=0){
            fact = fact * n;
            n--;
        }

        System.out.println("Factorial Of Num :"+fact);

    }
}
