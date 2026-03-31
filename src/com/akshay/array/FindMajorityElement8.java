package com.akshay.array;

import java.util.Scanner;

public class FindMajorityElement8 {

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


        int count = 1;
        System.out.println("FIND MAJORITY ELEMENT :");
        for(int i=0;i<a.length-1;i++){                     // 10,20,10,30,10
            if(a[i]==a[i+1]){
                count++;

                if(count>a.length/2){
                    System.out.println(a[i]+" is Majority element with count :"+count);
                }
            }
        }

        System.out.println("Display Array Elements :");
        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }
    }
}
