package com.akshay.strings;

import java.util.Scanner;

public class ConcatTwoStrings3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String :");
        String str1 = sc.nextLine();   // Akshay

        System.out.println("Enter the Second String :");
        String str2 = sc.nextLine();    // Tawale

        String str3 = "";   // AkshayTawale

        System.out.println("Copy first String into new string");
        for(int i=0;i<str1.length();i++){

            str3 = str3 + str1.charAt(i);

        }
        System.out.println(str3);

        System.out.println("Copy second String into new string");
        for(int i=0;i<str2.length();i++){
            str3 = str3 + str2.charAt(i);
        }
        System.out.println("New concatenated string is str3 : "+str3);

    }
}
