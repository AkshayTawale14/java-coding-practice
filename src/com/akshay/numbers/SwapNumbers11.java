package com.akshay.numbers;

import java.util.Scanner;

public class SwapNumbers11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int a = sc.nextInt();      //  10
        System.out.println("Enter Second number :");
        int b = sc.nextInt();      //  20


//        int a = 10;
//        int b = 20;

        a = a + b;     //10+20 =  a=30
        b = a - b;     // 30-20 = 10
        a = a - b;     // 30-10 = 20

        System.out.println("Numbers After swapping");
        System.out.println("A = "+a+ ", B = "+b);
    }
}
