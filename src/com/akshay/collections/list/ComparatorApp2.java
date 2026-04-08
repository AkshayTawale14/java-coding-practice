package com.akshay.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    private int id;
    private String name;
    private float marks;

    public Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}

class SortById implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getId()>s2.getId()){
            return 1;
        }
        else if(s1.getId()<s2.getId()){
            return -1;
        }
        else {
            return 0;
        }
    }
}

class SortByName implements Comparator<Student>{


    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
public class ComparatorApp2 {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1,"Rahul", 90.5f),
                new Student(5,"Ajinkya", 80.5f),
                new Student(3,"Ram", 70.5f)

        );

        System.out.println("Sort By Student Id :");
        //SortById sortById = new SortById();
        Collections.sort(students, new SortById());  // sortById
        for(Student s : students){
            System.out.println(s.getId()+" \t"+s.getName()+" \t"+s.getMarks());
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("Sort By Name :");
        SortByName sortByName = new SortByName();
        Collections.sort(students, sortByName);
        for(Student s : students){
            System.out.println(s.getId()+" \t"+s.getName()+" \t"+s.getMarks());
        }

    }
}
