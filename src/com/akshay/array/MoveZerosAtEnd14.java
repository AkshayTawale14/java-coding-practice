package com.akshay.array;

import java.util.Scanner;

public class MoveZerosAtEnd14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();  // Array length is 5 but index starts from 0 to 4

        int a[] = new int[size];
        int n = a.length;

        System.out.println("Enter Arrays Elements :");
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }

        int b[] = new int[n];
        int count = 0;
        System.out.println("Display Array Elements :");
        for(int i=0;i<a.length;i++){

            if(a[i]!=0){
                b[count] = a[i];
                count++;
            }

        }

        System.out.println("N = "+n);
        while(count<n){
            b[count] = 0;
            count++;
        }

        System.out.println("Display Array Elements after shifting :");
        for(int i=0;i<a.length;i++){

            System.out.println(b[i]);
        }
    }
}
