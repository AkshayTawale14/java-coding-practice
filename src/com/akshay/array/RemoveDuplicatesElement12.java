package com.akshay.array;

import java.util.Scanner;

public class RemoveDuplicatesElement12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();  // Array length is 5 but index starts from 0 to 4

        int a[] = new int[size];

        System.out.println("Enter Arrays Elements :");
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
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

        int count = 0;
        int result[] = new int[n];
        System.out.println("Display Array Elements :");
        for(int i=0;i<n-1;i++){

            if(a[i]!=a[i+1]){
                result[count] = a[i];
                count++;
            }
        }
        result[count]=a[n-1];
        for(int i=0;i<=count;i++){
            System.out.println(result[i]);
        }

    }
}
