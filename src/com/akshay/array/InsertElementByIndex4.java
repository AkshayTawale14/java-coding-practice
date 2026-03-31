package com.akshay.array;

import java.util.Scanner;

public class InsertElementByIndex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt(); //5

        int a[] = new int[size];

        System.out.println("Enter Arrays :");
        for(int i=0; i<size-1;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the index to be inserted at :");
        int index = sc.nextInt();
        System.out.println("Enter the value to be inserted at :");
        int value = sc.nextInt();

        int end = a.length-1;

        System.out.println("Display Array :");
        for(int i=0;i<a.length;i++){
            a[end] = a[end-1];
            if(a[end] == index){
                a[end] = value;
                break;
            }
            end--;
        }

        System.out.println("Display Array :");
        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }
    }
}
