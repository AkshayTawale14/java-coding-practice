package com.akshay.numbers;

import java.util.Scanner;

public class CheckForDuckNumber6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();      //  123045


        int rem;
        boolean flag = false;
        while(num>0){

            rem = num % 10;
            if(rem==0){
                flag = true;
                break;
            }
            num = num /10;
        }

        if(flag){
            System.out.println("Number is a Duck Number :");
        }
        else {
            System.out.println("Number is not a Duck Number :");
        }


    }
}
