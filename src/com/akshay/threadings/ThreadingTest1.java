package com.akshay.threadings;

class MyThread extends Thread{

    @Override
    public void run(){

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println(Thread.currentThread());
    }
}
public class ThreadingTest1 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread());

        MyThread t1 = new MyThread();
        System.out.println(Thread.currentThread());

        t1.start();
        System.out.println(Thread.currentThread());

        System.out.println("Main method start");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("Main method End");


    }
}
