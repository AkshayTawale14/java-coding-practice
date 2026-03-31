package com.akshay.pattern;

public class PrintCharacter54 {

    public static void main(String[] args) {

        char ch = 'A';
        int temp = 1;
        int count = 0;
        boolean flag = true;
        for(int i=1;i<=5;i++){

            temp = i + count;    //5
            char c = ch;
            for(int j=1;j<=9;j++){

                if(j<=temp){

                    if(flag){
                        System.out.print(ch--);
                        flag = false;
                    }
                    else {
                        System.out.print(ch++);
                        flag = true;
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
