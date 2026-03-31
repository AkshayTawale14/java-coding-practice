package com.akshay.strings;

import java.util.Scanner;

public class CountDigitsSymbolsAndAlphabets6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sc.nextLine();                // Aksharaj1234!@#$

        int alphaCount = 0;
        int digitCount = 0;
        int symbolCount = 0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)>= 65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122){
                alphaCount++;
            }
            else if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                digitCount++;
            }
            else {
                symbolCount++;
            }

        }

        System.out.println("Alphabets count is :"+alphaCount);
        System.out.println("DigitCount count is :"+digitCount);
        System.out.println("SymbolCount count is :"+symbolCount);
    }
}
