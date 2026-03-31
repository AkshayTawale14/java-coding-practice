package com.akshay.array;

import java.util.Scanner;

public class FindMaxAndMin9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();  // 5

        int a[] = new int[size];

        System.out.println("Enter Arrays Elements :");
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        System.out.println("Display Array Elements :");
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max= a[i];
            }
        }
        System.out.println("Max element is :"+max);

        int min = a[0];
        System.out.println("Display Array Elements :");
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Min element is :"+min);


    }
}
