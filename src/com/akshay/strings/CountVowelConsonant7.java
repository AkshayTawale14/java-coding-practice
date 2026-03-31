package com.akshay.strings;
import java.util.Scanner;

public class CountVowelConsonant7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str1 = sc.nextLine();                      // Akshay
        String str2 = str1.toLowerCase();
        //name.toCharArray();

        int len = str2.length();
        int vowelCount = 0;
        int consonentCount = 0;

        for(int i=0;i<len;i++){

            if(str2.charAt(i)>='a' && str2.charAt(i)<='z') {

                if(str2.charAt(i) == 'a' || str2.charAt(i)=='e' || str2.charAt(i)=='i' || str2.charAt(i)=='o' || str2.charAt(i)=='u'){

                    vowelCount++;
                    System.out.println("V : "+str2.charAt(i));

                }
                else{
                    consonentCount++;
                    System.out.println("C : "+str2.charAt(i));
                }
            }

        }
        System.out.println("Vowel Count is :"+vowelCount);
        System.out.println("Consonent count is :"+consonentCount);

    }
}
