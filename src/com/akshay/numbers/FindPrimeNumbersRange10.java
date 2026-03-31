package com.akshay.numbers;

import java.util.Scanner;

public class FindPrimeNumbersRange10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();      //  13

        int count = 0;
        for(int i=1;i<=num;i++){

            count = 0;
            for(int j=1;j<=i;j++){

                if(i%j==0){
                    count++;
                }
            }

            if(count==2){
                System.out.println(i);
            }
        }


    }
}
