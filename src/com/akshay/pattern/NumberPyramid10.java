package com.akshay.pattern;

import java.util.Scanner;

public class NumberPyramid10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();


        for(int i=1;i<=5;i++){

            for(int j=1;j<=6-i;j++){

                System.out.print(" "+j);
            }
            System.out.println();

        }
    }

}
