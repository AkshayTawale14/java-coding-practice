package com.akshay.array;

import java.util.Scanner;

public class PrimeNumbersInArray17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();  // Array length is 5 but index starts from 0 to 4

        int a[] = new int[size];

        System.out.println("Enter Arrays Elements :");
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }


//        System.out.println("Display Array Elements :");
//        for(int i=0;i<a.length;i++){          // 1, 2, 3, 4, 5, 6, 7
//
//            for(int j=2;j<a[i];j++){            // To check for prime numbers
//
//                if(a[i]%j!=0){
//                    System.out.println(a[i]);
//                }
//            }
//        }


        int count = 0;
        System.out.println("PRIME NUMBERS => ");
        for(int i=0;i<a.length;i++){          // 1, 2, 3, 4, 5, 6, 7

            count = 0;
            for(int j=1;j<=a[i];j++){

                if(a[i]%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(a[i]);
            }
        }

    }
}
