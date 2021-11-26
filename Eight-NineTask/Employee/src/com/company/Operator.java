package com.company;


public class Operator extends Employee implements EmployeePosition{

    public Operator(String name, String surname, String job, double salary){

        super(name, surname, job, salary);
    }

    public Operator(Employee person){

        super(person.getName(), person.getSurname(), person.getJob(), person.getSalary());
    }

    @Override
    public String getJobTitle(){

        return this.getJob();
    }

    @Override
    public double calcSalary(){

        return this.getSalary();
    }
}