package com.akshay.pattern;

import java.util.Scanner;

public class NumberPyramid12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();

        for(int i=1;i<=5;i++){

            int temp = i;
            for(int j=1;j<=9;j++){

                if(j>=6-i && j<=4+i){

                    if(j<5){
                        System.out.print(" "+temp++);

                    }
                    if(j==5){
                        System.out.print(" "+temp--);
                    }
                    if(j>5){
                        System.out.print(" "+temp--);
                    }
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
