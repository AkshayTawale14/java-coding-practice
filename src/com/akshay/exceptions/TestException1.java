package com.akshay.exceptions;

public class TestException1 {

    public static void main(String[] args)  {

        try{
            int result = 10 /0;          //java.lang.ArithmeticException: / by zero
            System.out.println(result);

            int a[] = {10, 20, 30};
            int value = a[5];         // java.lang.ArrayIndexOutOfBoundsException: 5

            System.out.println("Akshay".charAt(10));  // java.lang.StringIndexOutOfBoundsException
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
            System.out.println("First Error is "+e);
        }


    }
}
