package com.akshay.strings;

import java.util.Scanner;

public class ReverseWordDummy21 {

    public static String reverseWords(String input) {
        if (input == null) {
            return null;
        }

        int n = input.length();
        if (n == 0) {
            return "";
        }

        String result = "";  // will hold the final reversed-word string
        String currentWord = "";  // builds one word at a time

        // Traverse from the END of the string to the START
        for (int i = n - 1; i >= 0; i--) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                // If we have a word built, it means we just passed a word
                if (currentWord.length() > 0) {
                    // Add this word to the result
                    if (result.length() > 0) {
                        result = currentWord + " " + result;
                    } else {
                        result = currentWord;
                    }
                    currentWord = "";  // reset for next word
                }
                // If currentWord is empty, we are seeing multiple spaces → ignore
            } else {
                // Build the current word in reverse order (because we traverse backwards)
                // To get the word in correct order, we prepend each character
                currentWord = ch + currentWord;
            }
        }

        // After loop, if there’s a word left (last word from the original string)
        if (currentWord.length() > 0) {
            if (result.length() > 0) {
                result = currentWord + " " + result;
            } else {
                result = currentWord;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER STRING :");
        String input = sc.nextLine();              // e.g. "My name is Akash"


        String output = reverseWords(input);

        System.out.println("Output: " + output);
        // Expected: "Akash is name my"
    }
/*
    Example walk‑through
    Input: "My name is Akash"
    Index (from end):
    Read 'h','s','a','k','A' → currentWord = "Akash"
    Hit space → add "Akash" to result → result = "Akash"
    Read 's','i' → currentWord = "is"
    Hit space → add "is" → result = "Akash is"
    Read 'e','m','a','n' → currentWord = "name"
    Hit space → add "name" → result = "Akash is name"
    Read 'y',' ','M' → currentWord = "My"
    End of string → add "My" → result = "Akash is name My"

 */
}
