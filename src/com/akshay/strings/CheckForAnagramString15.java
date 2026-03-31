package com.akshay.strings;

import java.util.Scanner;


public class CheckForAnagramString15 {

    public static String sortFirst(String str1){

        char c1[] = str1.toCharArray();

        char temp1;
        System.out.println("Sorting the first String...");
        for(int i=0;i<str1.length();i++){

            for(int j=i+1;j<str1.length();j++){

                if(c1[i]>c1[j]){
                    temp1 = c1[i];
                    c1[i] = c1[j];
                    c1[j] = temp1;
                }
            }
        }

        return new String(c1);
    }

    public static String sortSecond(String str2){

        char c2[] = str2.toCharArray();

        char temp2;
        System.out.println("Sorting the second String...");
        for(int i=0;i<str2.length();i++){

            for(int j=i+1;j<str2.length();j++){

                if(c2[i]>c2[j]){
                    temp2 = c2[i];
                    c2[i] = c2[j];
                    c2[j] = temp2;
                }
            }

        }
        return new String(c2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String :");
        String str1 = sc.nextLine().toLowerCase();   // Akshay


        System.out.println("Enter the Second String :");
        String str2 = sc.nextLine().toLowerCase();    // Tawale

        System.out.println("First sort string");
        String result1 = sortFirst(str1);

        System.out.println("Second sort string");
        String result2 = sortSecond(str2);

        boolean flag = true;
        if(result1 == null || result2 == null || result1.length() != result2.length()){
            System.out.println("String is not Anagram");
        }
        else {

            for(int i =0;i<result1.length();i++){
                if(result1.charAt(i)!=result2.charAt(i)){
                    flag = false;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("String is an Anagram ");
        }
        else {
            System.out.println("String is not an Anagram ");
        }


    }
}
