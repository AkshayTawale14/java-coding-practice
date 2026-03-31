package com.akshay.strings;
import java.util.Scanner;

public class ConvertStringUpperToLower5 {

    public static String toggleCase(String str){
        char chars[] = str.toCharArray();

        for(int i=0;i<str.length();i++){
            char ch = chars[i];

            if(ch>= 'A' && ch<= 'Z'){               // can also use the numbers 65 & 90
                chars[i] = (char) (ch + 32);
            }

            if(ch>= 'a' && ch<= 'z'){                // can also use the numbers 97 & 122
                chars[i] = (char) (ch- 32);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String :");
        String str1 = sc.nextLine();  // ABCDdefg

        String result = toggleCase(str1);
        System.out.println("Result => "+result);
    }

}
