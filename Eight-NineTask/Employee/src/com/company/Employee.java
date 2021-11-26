package com.company;

public abstract class Employee {

    private String name, surname, job;
    private double salary, earnings;
    private Company company;

    public Employee(String name, String surname, String job, double salary){

        this.name = name;
        this.surname = surname;
        this.job = job;
        this.salary = salary;
        this.earnings = Random.rand(115000, 140000);
    }

    public void setCompany(Company company){

        this.company = company;
    }

    public Company getCompany(){

        return company;
    }

    public String getName(){

        return name;
    }

    public String getSurname(){

        return surname;
    }

    public String getJob(){

        return job;
    }

    public double getSalary(){

        return salary;
    }

    public double getEarnings(){

        return earnings;
    }

    @Override
    public String toString(){

        return "Employee: -> " + " Name: |" + name + "| Surname: |" + surname + "| Job: |" + job +
                "| Salary: |" + salary + "| incomeOne: |" + earnings + "| Company: |" + company + "| <-";
    }
}