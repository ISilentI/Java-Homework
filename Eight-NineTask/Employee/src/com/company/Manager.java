package com.company;

public class Manager extends Employee implements EmployeePosition{

    public Manager(String name, String surname, String jobTitle, double salary){

        super(name, surname, jobTitle, salary);
    }

    public Manager(Employee person){

        super(person.getName(), person.getSurname(), person.getJob(), person.getSalary());
    }

    @Override
    public String getJobTitle(){

        return this.getJob();
    }

    @Override
    public double calcSalary(){

        return this.getSalary() + this.getEarnings() * 0.05;
    }


}