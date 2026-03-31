package com.akshay.array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseArray3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter Arrays :");   // 10,20,30,40,50
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }

        int temp = 0;
        int end = a.length-1;
        System.out.println("Display Array :");
        for(int i=0;i<a.length/2;i++){
            temp =  a[i];
            a[i] =  a[end];
            a[end] = temp;
            end--;

        }

        System.out.println("REVERSE ARRAY :");
        for(int i=0; i<size;i++){
            System.out.println(a[i]);
        }
    }
}
