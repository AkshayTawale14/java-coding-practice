package com.akshay.numbers;

import java.util.Scanner;

public class SwapFirstAndLastDigit12 {

    // Counts digits using loop
    public static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Gets first digit
    public static int getFirstDigit(int num) {
        int digits = countDigits(num);
        int first = num;
        for (int i = 1; i < digits; i++) {
            first /= 10;
        }
        return first;
    }

    // Swaps first and last digits
    public static int swapFirstLast(int num) {
        if (num < 10) return num;
        int digits = countDigits(num);
        int first = getFirstDigit(num);
        int last = num % 10;
        // Remove first digit
        int power = 1;
        for (int i = 1; i < digits; i++) {
            power *= 10;                      // power = 1000;
        }
        int middle = (num % power) / 10;
        // Build new: last * 10^(digits-1) + middle * 10 + first
        int newNum = last * power + middle * 10 + first;
        return newNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Result: " + swapFirstLast(num));
        sc.close();
    }
}
