package com.akshay.array;

import java.util.Scanner;

public class BinarySearchElement22 {

    public static int binarySearch(int a[], int target){

        int start = 0;
        int mid = a.length/2;
        int end = a.length-1;

        for(int i=0;i<a.length-1;i++){

            mid = start + (end - start) / 2;

            if(a[mid]==target){
                return mid;
            }
            if(target>a[mid]){
                start = mid+1;


            }
            if(target<a[mid]){
                end = mid-1;

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {8,15,22,32,38,45,53,64,72};   // 9
        int mid = a.length/2;
        System.out.println(mid);
        int target = 64;    //64

        int result = binarySearch(a, target);
        if(result!= -1){
            System.out.println("Target found at index "+result);
        }
        else {
            System.out.println("Target not found ");
        }


    }
}
