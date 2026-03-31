package com.akshay.basics;

import java.util.Scanner;

public class CheckForArmstrongNumber {

    public static void main(String[] args) {
        // for pallindrome reverse number and compare with original number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();   // 153

        if(isArmstrongNumber(num)){
            System.out.println("number is Armstrong:");
        }
        else {
            System.out.println("Number not armstrong :");
        }
    }

    public static int countDigit(int num){
        int count = 0;
        while(num>0){
            num /= 10;
            count++;
        }
        return count;
    }

    public static int power(int base , int exp){
        int result = 1;
        while(exp>0){
            result = result * base;  // 1*3*3*3153

            exp--;
        }
        System.out.println("power : "+result);
        return result;
    }
    public static boolean isArmstrongNumber(int num){
        int original = num;
        int digits = countDigit(num);
        System.out.println("digits :"+digits);
        int sum = 0;
        System.out.println("Sum, num :"+sum+" "+num);

        while(num>0){
            int rem = num % 10;
            sum = sum + power(rem, digits);
            num = num / 10;
        }

        System.out.println(sum);
        return sum == original;
    }


}
