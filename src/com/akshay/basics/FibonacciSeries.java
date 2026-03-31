package com.akshay.basics;

public class FibonacciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        System.out.println(first+"\n"+second);

        int prev = 0;
        int next = 1;

        for(int i=0;i<10;i++){

            int nextTerm = prev + next;      //  0+1 = 1, 1+1=2
            System.out.println(nextTerm);
            prev = next;
            next = nextTerm;

        }


    }
}
