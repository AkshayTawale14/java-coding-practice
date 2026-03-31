package com.akshay.exceptions;

import java.util.Scanner;

class InvalidAgeException extends Exception{

    public  InvalidAgeException(String msg){
        super(msg);
    }

}


public class UserDefinedException {

    public static void invalidAge(int age) throws InvalidAgeException {

        if(age<18 || age>60){
            throw new InvalidAgeException("Age must be greater the 18");
        }
        else{
            System.out.println("You are valid...");
        }

    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = sc.nextInt();

        try{
            invalidAge(age);
        }
        catch (Exception e){
            System.out.println("Exception is : "+e);
        }

    }

}
