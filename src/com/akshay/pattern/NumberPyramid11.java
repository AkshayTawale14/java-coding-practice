package com.akshay.pattern;

import java.util.Scanner;

public class NumberPyramid11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();


        for(int i=1;i<=5;i++){

            for(int j=1;j<=5;j++){

                if(j==1 || i==5 || j==i){
                    System.out.print(" "+j);
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

}
