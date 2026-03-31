package com.akshay.array;

import java.util.Scanner;

public class MissingArrayElement11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();  // length is 5 but index starts from 0 to 4

        int a[] = new int[size];

        System.out.println("Enter Arrays Elements :");
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }

        int n = a.length;
        System.out.println("SORT IN ASCENDING");
        for(int i=0;i<n-1;i++){

            for(int j=i+1;j<n;j++){

                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }

        System.out.println("Display Array Elements :");
        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }

        System.out.println("display MISSING..");
        for(int i=0;i<a.length-1;i++){
            for(int j=a[i]+1; j<a[i+1];j++){
                System.out.println(j);
            }
        }


    }
}
