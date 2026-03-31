package com.akshay.basics;

public class CheckUpperLowerCase {

    public static void main(String[] args) {

        char ch = '@';  // Test character

        if(ch >= 'A' && ch <= 'Z') {            //65-90   diff +32
            System.out.println("'" + ch + "' is uppercase.");
        }
        else if (ch >= 'a' && ch <= 'z') {       //97-122
            System.out.println("'" + ch + "' is lowercase.");
        } else if (ch >= '0' && ch <= '9') {        // 0=48, 9=57
            System.out.println("'" + ch + "' is a digit.");
        } else {
            System.out.println("'" + ch + "' is special.");
        }
    }
}
