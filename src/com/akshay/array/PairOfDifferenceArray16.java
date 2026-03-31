package com.akshay.array;

import java.util.Scanner;

public class PairOfDifferenceArray16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size :");
        int size = sc.nextInt();  // Array length is 5 but index starts from 0 to 4

        int a[] = new int[size];

        System.out.println("Enter Arrays Elements :");   // //int[] a = {10, 5, 2, 8};
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }

        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff1 = a[i] - a[j];
                //int diff2 = a[j] - a[i];

                System.out.println("Pair (" + i + "," + j + ") -> "
                        + a[i] + " - " + a[j] + " = " + diff1);

//                System.out.println("Pair (" + j + "," + i + ") -> "
//                        + a[j] + " - " + a[i] + " = " + diff2);
            }
        }
    }
}
