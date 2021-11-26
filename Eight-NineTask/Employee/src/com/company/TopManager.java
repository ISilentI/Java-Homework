package com.company;

public class TopManager extends Employee implements EmployeePosition {

    public TopManager(String name, String surname, String jobTitle, double salary){

        super(name, surname, jobTitle, salary);
    }

    public TopManager(Employee person){

        super(person.getName(), person.getSurname(), person.getJob(), person.getSalary());
    }

    @Override
    public String getJobTitle(){

        return this.getJob();
    }

    @Override
    public double calcSalary(){

        double premium = 0, sum = 0;

        sum = this.getCompany().getStaff().stream().filter(i -> i.getJob().equals("Manager") ||
                        i.getJob().equals("Operator")).mapToDouble(Employee::getSalary).sum();

        if (sum > 10000000){

            premium = 1.5 * this.getSalary();
        }

        return this.getSalary() + premium;
    }
}