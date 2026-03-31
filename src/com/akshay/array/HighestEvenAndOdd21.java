package com.akshay.array;

import java.util.Scanner;

public class HighestEvenAndOdd21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array Size");
        int size = sc.nextInt(); //5
        int a[] = new int[size];  //   4, 5, 7, 13, 10, 15, 20, 27, 32, 35

        System.out.println("Enter the array elements :");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }

        int maxEven = a[0];
        int maxOdd = a[0];
        for(int i=0;i<size;i++){

            if(a[i]%2==0){

                if(a[i]>maxEven){
                    maxEven = a[i];
                }
            }

            if(a[i]%2!=0){

                if(a[i]>maxOdd){
                    maxOdd = a[i];
                }
            }
        }

        System.out.println("Maximum Even number in array is : "+maxEven);
        System.out.println("Maximum Odd number in array is : "+maxOdd);
    }
}
