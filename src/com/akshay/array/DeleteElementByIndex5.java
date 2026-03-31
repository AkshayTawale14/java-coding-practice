package com.akshay.array;

import java.util.Scanner;

public class DeleteElementByIndex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter Arrays :");
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Display Array Before:");
        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }

        System.out.println("Enter the index :");
        int index = sc.nextInt();  // 2

        a = deleteIndexAt(a, index);


        System.out.println("Display Array After delete:");
        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }
    }

    public static int[] deleteIndexAt(int a[], int index){

        if(a==null || index<0 || index>=a.length){
            return a;
        }

        int n = a.length;        // 4
        int result[] = new int[n-1];

        for(int i =0;i<index;i++){
            result[i] = a[i];
        }

        for(int i=index+1;i<n;i++){
            result[i-1] = a[i];
        }

        return result;
    }
}
