package com.akshay.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest2 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        FileInputStream fs = new FileInputStream("abc.text");   // Unhandled exception: java.io.FileNotFoundException

        Thread.sleep(3000);   //  Unhandled exception: java.lang.InterruptedException

        //int res = 10 / 0;

        // throws only handle checked exception
        // unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
        // unreported exception java.lang.InterruptedException; must be caught or declared to be thrown

    }
}
