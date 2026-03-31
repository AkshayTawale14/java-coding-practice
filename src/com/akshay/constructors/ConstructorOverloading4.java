package com.akshay.constructors;

import org.w3c.dom.css.Rect;

import java.util.concurrent.RecursiveAction;

class Rectangle{
    private int len;
    private int wid;

    Rectangle(){
        this(5, 10);

    }

    Rectangle(int l, int w){
        this(5.5f, 10.5f);
        System.out.println("Area : "+l*w);

    }

    Rectangle(float l, float w){
        System.out.println("AREA :"+l*w);
    }


        }
public class ConstructorOverloading4 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

    }
}
