package com.akshay.constructors;
class Employee{

    private int id;
    private String name;
    private double salary;

//    Employee(){
//        System.out.println("Default Constructor is :");
//        System.out.println("D => Id ="+id+",  Name = "+name+", Salary = "+salary);
//
//    }

    public Employee(int id, String name, double salary){

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void getEmployee(){
        System.out.println("Id = "+id+",  Name = "+name+", Salary = "+salary);
    }

}

public class ConstructorInitialize1 {

    public static void main(String[] args) {

        int id = 1;
        String name = "Ganesh";
        double salary = 30000;

//        Employee employee = new Employee();
//        employee.getEmployee();

        Employee employee = new Employee(id, name, salary);
        employee.getEmployee();
    }
}
