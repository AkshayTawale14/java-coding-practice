package com.akshay.constructors;

class Student{

    private int id;
    private String name;

    Student(){
        this(3, "Prince");
    }

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void getStudent(){
        System.out.println("ID ="+id+", Name = "+name);
    }
}

public class ConstructorChaining2 {

    public static void main(String[] args) {

        int id = 1;
        String name = "Swapnil";

        Student s1 = new Student();
//        Student s2 = new Student(2, "Rahul");
        s1.getStudent();

    }
}
