package com.akshay.pattern;

import java.util.Scanner;

public class PrintCharacter52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();

        char ch = 'A';
        for(int i=1;i<=5;i++){

            ch = 'A';
            for(int j=1;j<=9;j++){

                if(j<=6-i || j>=4+i){

                    if(j<5){
                        System.out.print(ch++);

                    }
                    if(j==5){
                        System.out.print(ch--);

                    }
                    if(j>5){
                        System.out.print(ch--);

                    }
                }
                else {
                    System.out.print(" ");
                    if(j<5){
                        ch++;

                    }
                    if(j==5){
                        ch--;

                    }
                    if(j>5){
                        ch--;

                    }
                }
            }
            System.out.println();
        }
    }
}
