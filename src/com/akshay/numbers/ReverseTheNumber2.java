package com.akshay.numbers;

import java.util.Scanner;

public class ReverseTheNumber2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // 123

        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();     // 12321

        int reverse = 0;
        int rem;

        while(num>0){
            rem = num %10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reverse number is :"+reverse);

    }
}
