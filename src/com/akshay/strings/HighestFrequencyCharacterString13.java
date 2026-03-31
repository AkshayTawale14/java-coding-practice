package com.akshay.strings;

import java.util.Scanner;

public class HighestFrequencyCharacterString13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sc.nextLine().toLowerCase();   // akshayraj
        char[] str1 =  str.toCharArray();

        char temp ;
        for(int i=0;i<str.length();i++){

            for(int j=i+1;j<str.length();j++){

                if(str1[i]>str1[j]){
                    //char ch = str.charAt(i);
                    temp =  str1[i];
                    str1[i] = str1[j];
                    str1[j] = temp;

                }
            }
        }
        System.out.println(str1);

        int maxCount = 0;
        int charCount = 1;
        char high_freq_char = 0;
        for(int i=0;i<str.length()-1;i++){

            if(str1[i]==str1[i+1]){
                charCount++;
            }
            else {
                System.out.println("Count of "+str1[i]+ " = "+charCount);

                if(charCount>maxCount){

                    maxCount = charCount;
                    high_freq_char = str1[i];
                    //System.out.println("Character is : "+str1[i]);
                }
                charCount = 1;
            }
        }


        // ✅ Handle last character
        System.out.println("Count of " + str1[str1.length - 1] + " = " + charCount);

        if(charCount>maxCount){
            System.out.println("High Frequency character is : "+str1[str.length()-1]+" with count = "+charCount);
        }
        else{
            System.out.println("High Frequency character is : "+high_freq_char+" with count = "+maxCount);
        }

    }
}
