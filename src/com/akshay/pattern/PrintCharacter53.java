package com.akshay.pattern;

import java.util.Scanner;

public class PrintCharacter53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = 'A';
        int temp = 1;
        int count = 0;
        boolean flag = true;

        for(int i=1;i<=5;i++){
            temp = i + count;    //5
            char c = ch;
            for(int j=1;j<=9;j++){

                if(j<=temp){

                    if(ch>'A' && flag){
                        System.out.print(ch--);    // C,B,A,B
                        if(ch=='A'){
                            flag = false;
                        }
                    }
                    else{
                        System.out.print(ch++);
                    }
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            count++;
            ch = c;
            ch++;
            flag = true;
        }
    }
}
