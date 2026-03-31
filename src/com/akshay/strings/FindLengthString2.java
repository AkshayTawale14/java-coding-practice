package com.akshay.strings;

public class FindLengthString2 {

    public static void main(String[] args) {

        String name = "Abhishek";


        int count = 0;
        // Meyhod 1
        for(char ch : name.toCharArray()){
            count++;
        }
        System.out.println("String length is : "+count);

        int counter = 0;
        try{
            while(true){
                name.charAt(counter);
                counter++;
            }
        }
        catch (Exception e){
            // exception String index out of bound
            System.out.println("exception is "+e);
        }

        System.out.println("String length is : "+counter);


    }
}
