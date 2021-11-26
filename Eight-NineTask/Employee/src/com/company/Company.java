package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    private ArrayList<Employee> staff = new ArrayList<>();
    private double income = 0;

    public void hire(Employee employee){

        employee.setCompany(this);
        this.staff.add(employee);
        this.income += employee.getEarnings();
    }

    public void hireAll(ArrayList<Employee> staffExterior){

        this.staff.addAll(staffExterior);
        staffExterior.forEach((s) -> this.income += s.getEarnings());
    }

    public void fire(int index){

        this.staff.remove(index);
        this.income -= this.staff.get(index).getEarnings();
    }

    public void fireCount(int count){

        for (int i = 0; i < count; i++) {
            fire(i);
        }
    }

    public ArrayList<Employee> getStaff(){

        return staff;
    }

    public double getIncome(){

        return this.income;
    }

    List getLowestSalaryStaff(int count){

            return this.getStaff().stream().sorted(Comparator.comparing(Employee::getSalary))
                    .limit(count).collect(Collectors.toList());
    }

    List getTopSalaryStaff(int count){

            return this.getStaff().stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .limit(count).collect(Collectors.toList());
    }
}