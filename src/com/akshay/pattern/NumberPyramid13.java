package com.akshay.pattern;

import java.util.Scanner;

public class NumberPyramid13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();

        for(int i=1;i<=5;i++){

            int temp = i;
            for(int j=1;j<=11;j++){

/*                if(i==5 || j==5+i || j==7-i ){
                    if(j==6-i){
                        System.out.print(1);
                    }
                    if(i==5){
                        System.out.print(j);
                    }
                    if(j==5+i){
                        System.out.print(i);
                    }
                }

 */
                if(i==5){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
