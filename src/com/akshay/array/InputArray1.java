package com.akshay.array;

import java.util.Scanner;

public class InputArray1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();  // Array length is 5 but index starts from 0 to 4

        int a[] = new int[size];

        System.out.println("Enter Arrays Elements :");
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Display Array Elements :");
        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }
    }
}
