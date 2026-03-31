package com.akshay.array;

import java.util.Scanner;

public class SumOfArray2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter Arrays :");
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.println("Display Array Sum:");
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }

        System.out.println("array Sum is :"+sum);
    }
}
