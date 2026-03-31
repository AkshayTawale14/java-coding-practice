package com.akshay.numbers;

import java.util.Scanner;

public class CheckForPerfectNumber5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();      // 6 =  1+2+3

        int sum = 0;
        for(int i=1;i<num;i++){

            if(num%i==0){
                sum = sum + i;
            }
        }

        if(num==sum){
            System.out.println("Number is a perfect number :");
        }
        else {
            System.out.println("Number is not a perfect number :");
        }


    }
}
