package com.akshay.strings;

import java.util.Scanner;

public class ReverseString9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str1 = sc.nextLine();   // Akshay

        String str2 = "";

        for(int i=0;i<str1.length();i++){
            str2 =  str1.charAt(i) +  str2;   // YAHSKA
        }

        System.out.println("Reverse String is =>"+str2);
    }
}
