package com.akshay.strings;

import java.util.Scanner;

public class ReverseWordOfString11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER STRING :");
        String input = sc.nextLine();              // e.g. "Mango is sweet"

        String word = "";
        String result = "";

        //Iterate given string/sentence
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);

            //check if current character is space
            if(ch== ' '){                          //input.charAt(i)
                result = word +" "+result;        //  sweet + is + mango
                System.out.println("-> "+result);
                word = "";                         // Reset the character
            }
            word = word + ch;                      // build the current word
            //System.out.println(word);

        }
        result = word+ " "+result;                // add last word to result
        System.out.println("Reverse String is : "+result);


    /*
        String s = "";
        String name = "Sun rises at east";
        for(int i=0;i<name.length();i++){
            s = s + name.charAt(i);    // s+u+n i+s
        }
        System.out.println(s);
    */

    }

}
