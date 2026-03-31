package com.akshay.array;

import java.util.Scanner;

public class LinearSearch21 {

    public static int linearSearch(int arr[], int target){

        int len = arr.length;

        for(int i=0;i<len;i++){

            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int target = 90;

        int indexValue = linearSearch(arr, target);
        if(indexValue!= -1) System.out.println("target value found at Index => "+indexValue);
        else System.out.println("target value NOT FOUND in Array... ");



//        System.out.println("Enter Array size :");
//        int size = sc.nextInt();
//        int a[] = new int[size];


//        System.out.println("Enter Arrays Elements :");
//        for(int i=0; i<size;i++){
//            a[i] = sc.nextInt();
//        }

    }
}
