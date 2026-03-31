package com.akshay.numbers;

import java.util.Scanner;

public class SwapFirstLast {

    public static int getFirstDigit(int num){
        int first = num;
        int digits = findDigits(num);

        for(int i=1;i<digits;i++){
            first = first / 10;
        }
        System.out.println("First digit :"+first);
        return first;
    }

    public static int findDigits(int num){
        int temp = num;
        int digits = 0;
        while(temp>0){
            temp = temp / 10;
            digits++;
        }
        System.out.println("Digit count :"+digits);
        return digits;
    }

    public static int swapFirstLast(int num){

        int digits = findDigits(num);
        int first = getFirstDigit(num);

        int power = 1;
        for(int i=1;i<digits;i++){     // 1 23 4
            power = power*10;         // 1000
        }
        System.out.println("Power is : "+power);
        int middle = (num % power)/10;
        System.out.println("Middle : "+middle);
        int last = num %10;
        System.out.println("Last : "+last);

        int swapNumber = last * power +middle*10+first;         //  4*1000+23*10+1;
        System.out.println("NewNumber : "+swapNumber);
        return swapNumber;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();                               // 1 23 4
        System.out.println("Result: " + swapFirstLast(num));
        sc.close();
    }
}
