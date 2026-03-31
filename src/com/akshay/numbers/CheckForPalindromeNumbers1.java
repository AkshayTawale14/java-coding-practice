package com.akshay.numbers;
import java.util.Scanner;

//check for Palindrome number
public class CheckForPalindromeNumbers1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // 123

        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();     // 12321
        int original = num;

        int rem;
        int rev = 0;

        while(num>0){                     //Method-2 : also convert num into strings and reverse the string

            rem = num % 10;
            rev = rev * 10 + rem;  //
            num = num / 10;

        }

        if(rev==original){
            System.out.println("Number is palindrome number ");
        }
        else {
            System.out.println("Number is not palindrome number ");
        }

    }
}
