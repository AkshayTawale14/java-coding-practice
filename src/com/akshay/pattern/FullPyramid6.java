package com.akshay.pattern;

import java.util.Scanner;

public class FullPyramid6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();

        for(int i=1;i<=6;i++){

            for(int j=1;j<=11;j++){

                if(j<=5+i && j>=7-i){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
