package com.akshay.strings;

import java.util.Scanner;

public class CheckForPalindromeString10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str1 = sc.nextLine();   // abcba

        int len = str1.length();
        int end = len -1;
        boolean flag = false;
        
        for(int i=0;i<str1.length()/2;i++){

            if(str1.charAt(i)!=str1.charAt(end)){
                flag = true;
                break;
            }
            end--;
        }

        if(!flag){
            System.out.println("string is  palindrome :");
        }
        else {
            System.out.println("String is not palindrome");
        }


    }
}
