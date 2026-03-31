package com.akshay.array;

import java.util.Scanner;

public class SortArrayByAsce6 {

    public static void main(String[] args) {

        //Sort array in ascending
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();  // 5

        int a[] = new int[size];

        System.out.println("Enter Arrays :");
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Display Array BEFORE:");
        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }

        int n = a.length;
        System.out.println("Ascending ");
        for(int i=0;i<n-1;i++){        // 5

            for(int j=i+1;j<n;j++){

                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }

        System.out.println("Display Array AFTER:");
        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }

    }
}
