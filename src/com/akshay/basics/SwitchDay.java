package com.akshay.basics;

import java.util.Scanner;

public class SwitchDay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE DAY :");
        String day = sc.nextLine().toLowerCase();

        switch (day){
            case  "monday":
                System.out.println("Monday");
                break;

            case "tuesday":
                System.out.println("Tuesday");
                break;

            case "wednesday":
                System.out.println("Wednesday");
                break;


            case  "thursday":
                System.out.println("Thursday");
                break;

            case  "friday":
                System.out.println("Friday");
                break;

            case  "saturday":
                System.out.println("Saturday");
                break;

            case  "sunday":
                System.out.println("Monday");
                break;

            default:
                System.out.println("Invalid day :");
        }
    }
}
