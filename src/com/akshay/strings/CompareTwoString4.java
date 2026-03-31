package com.akshay.strings;

import java.util.Scanner;

public class CompareTwoString4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String :");
        String str1 = sc.nextLine().toLowerCase();   // Akshay

        System.out.println("Enter the Second String :");
        String str2 = sc.nextLine().toLowerCase();    // Tawale

        boolean flag = true;
        if(str1.length()!=str2.length()){
            flag  = false;
        }
        else {
            for(int i=0;i<str1.length();i++){

                if(str1.charAt(i)!=str2.charAt(i)){
                    flag = false;
                    break;
                }

            }

        }


        if(flag){
            System.out.println("Strings are equals :");
        }
        else {
            System.out.println("String are not equals :");
        }


    }
}
