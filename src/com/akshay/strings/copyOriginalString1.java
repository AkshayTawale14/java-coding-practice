package com.akshay.strings;

import java.util.Scanner;

public class copyOriginalString1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER STRING :");
        String name = sc.nextLine();
        int len = name.length();

        char ch[] = new char[len];
        for(int i =0;i<name.length();i++){
            ch[i] = (char)name.charAt(i);
        }
        System.out.println("Copy name is "+new String(ch));


//        String str1 = "Life is Beautiful";
//        str1.toCharArray();
//        char str2 = 0;
//
//        for(int i=0;i<str1.length();i++){
//            str2 = str1.charAt(i);
//        }

    }
}
