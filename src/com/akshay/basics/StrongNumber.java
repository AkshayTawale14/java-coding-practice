package com.akshay.basics;

public class StrongNumber {

    public static void main(String[] args) {

        System.out.println("Enter Number :");
        int num = 145;
        //int original = num;

        if(isStrongNumber(num)){
            System.out.println("Numner is strong number :");
        }
        else {
            System.out.println("Number is not strong number :");
        }


    }

    public static int factDigit(int rem){
        int fact = 1;
        while(rem>0){
            fact = fact * rem;
            rem--;
        }
        System.out.println("fact :"+fact);
        return fact;
    }

    public static boolean isStrongNumber(int num){
        int original = num;
       // int rem = 0;
        int sum = 0;

        while (num > 0) {
           int rem =  num % 10;
            int factorial = factDigit(rem);
            sum = sum + factorial;
            num = num / 10;
        }

        System.out.println("Sum :" +sum+ " &  original :" +original);
        return sum == original;
    }
}
