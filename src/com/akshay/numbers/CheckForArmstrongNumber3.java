package com.akshay.numbers;

import java.util.Scanner;

public class CheckForArmstrongNumber3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // 123

        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();     // 153       [ A-P, S-F ]

        int original = num;

        int digitCount = 0;
        while(num>0){
            num = num / 10;
            digitCount++;
        }
        System.out.println("DigitCount : "+digitCount);

        num = original;

        double sum1 = 0;
        int sum = 0;

        while(num>0){
            int rem = num % 10;

            int prod = 1;

            for(int i=0;i<digitCount;i++){           // can create method to find power
                prod = prod * rem;
            }
            sum = sum + prod;

            num = num / 10;


        /*    //int result = Math.pow(rem, digitCount);        //math.pow(base, exp);
            sum = sum + Math.pow(rem, digitCount);      //

         */

        }

        if(sum == original){
            System.out.println(sum+" Number is Armstrong number "+original);
        }
        else {
            System.out.println(sum+" Number is not Armstrong number "+original);
        }

        sc.close();
    }
}
