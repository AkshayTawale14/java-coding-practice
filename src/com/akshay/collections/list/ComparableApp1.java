package com.akshay.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class  Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee e) {

        if(this.salary > e.salary){
            return 1;
        }
        else if(this.salary < e.salary){
            return -1;
        }
        else{
            return 0;
        }

    }
}

public class ComparableApp1 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Ganesh", 30000),
                new Employee(2,"Akshay",45000),
                new Employee(3,"prashant",20000)
        );

        Collections.sort(employees);   // So sorting is based purely on salary in ascending order (lower salary comes first).
        Collections.sort(employees);
                                        /*expects the list elements to be Comparable.
                                         It internally uses Employee.compareTo() to compare every pair of Employee objects and rearranges the list so that:
                                         Employees with lower salary come earlier in the list.
                                         Employees with higher salary come later.
                                          */

        for(Employee e : employees){
            System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
        }

    }
}
