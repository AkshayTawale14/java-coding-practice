package com.akshay.strings;

import java.util.Scanner;

public class SumOfNumbersINString16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sc.nextLine().toLowerCase();   // akshayraj

        int sum = 0;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i) >= 48 && str.charAt(i)<=57){
                char ch = str.charAt(i);
//                int digit = (int)ch -48;
//                sum = sum + digit;
               sum = sum + (int)ch-48;
                System.out.println(sum);
            }
        }
        System.out.println("Sum of Numbers is : "+sum);

    }
}
