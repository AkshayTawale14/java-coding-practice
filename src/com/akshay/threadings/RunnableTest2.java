package com.akshay.threadings;

class Test implements Runnable{

    public void run(){

        try{


//            for(int i=1;i<=10;i++){
//                System.out.println(i);
//                Thread.sleep(1000);
//            }

            for(int j=0;j<=3;j++){
                System.out.println(j);
                Thread.sleep(1000);
            }

            System.out.println("Wait ......!!");
            Thread.sleep(2000);

            String name = "Happy Birthday Akshay";

            for(int i=0;i<name.length();i++){
                System.out.print(name.charAt(i));
                Thread.sleep(1000);
            }

        }
        catch (Exception e){
            System.out.println("Exception is : "+e);
        }




    }
}
public class RunnableTest2 {

    public static void main(String[] args) {


        Test r1 = new Test();
        Thread t1 = new Thread(r1);
        t1.start();


    }
}
