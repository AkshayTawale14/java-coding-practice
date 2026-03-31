package com.akshay.numbers;

import java.util.Scanner;

public class CheckForPrimeNumber9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();      //  13

        boolean flag = true;
        for(int i=2;i<num;i++){

            if(num%i==0){
                flag = false;     // Not

            }

        }

        if(flag){
            System.out.println("number is a prime number");
        }
        else {

            System.out.println("number is not a prime number");
        }
    }
}
