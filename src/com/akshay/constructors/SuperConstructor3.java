package com.akshay.constructors;

class Vehicle{
    private String name;

    Vehicle(String name){
        System.out.println("Vehicle name is = "+name);
    }
}

class Car extends Vehicle{

    private String type;

    public Car(String name, String type){
        super(name);
        System.out.println("Vahicle name is : "+name+" Type : "+type);
    }

//    public Car(String name, String sports) {
//        super(name);
//        System.out.println("Vahicle name is : "+name+" Type : "+type);
//    }
}

public class SuperConstructor3 {

    public static void main(String[] args) {

        Car c1 = new Car("TATA", "Sports");
    }
}
