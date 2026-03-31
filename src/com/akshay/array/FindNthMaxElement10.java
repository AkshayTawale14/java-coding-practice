package com.akshay.array;

import java.util.Scanner;

public class FindNthMaxElement10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();  // 5

        int a[] = new int[size];

        System.out.println("Enter Arrays Elements :");
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }

        int n = a.length;
        System.out.println("Descending.. ");
        for(int i=0;i<n-1;i++){        // 5

            for(int j=i+1;j<n;j++){

                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }

        System.out.println("Display Array Elements AFTER SORTING:");
        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }

        System.out.println("Enter nth max element to find out :");
        int nthMax = sc.nextInt();

        int count = 0;
        System.out.println("Display Array Elements :");
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                count++;
                if(count==nthMax){
                    System.out.println(a[i]+" is the nth third highest element"+count);
                }
            }
        }


    }
}
