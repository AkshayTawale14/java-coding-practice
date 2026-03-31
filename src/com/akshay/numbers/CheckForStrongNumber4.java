package com.akshay.numbers;

import java.util.Scanner;

public class CheckForStrongNumber4 {

    public static int getFactorial(int num){
        int fact = 1;
        for(int i=num;i>0;i--){
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();     // 145       [ A-P, S-F ]
        int original = num;

        int rem;
        int sum = 0;
        while(num>0){
            rem = num % 10;
            int result = getFactorial(rem);
            sum = sum + result;
            num = num / 10;
        }

        if(sum==original){
            System.out.println("Given number is strong number :");
        }
        else {
            System.out.println("Given number is not a Strong..");
        }

    }
}
