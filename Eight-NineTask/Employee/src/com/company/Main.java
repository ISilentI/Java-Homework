package com.company;

public class Main {

    public static void main(String[] args){

        Company company = new Company();
        for (int i = 0; i < 180; i++){

            company.hire(new Operator(Integer.toString(i), Integer.toString(i), "Operator",
                    Random.rand(12000, 20000)));
        }

        for (int i = 0; i < 80; i++){

            company.hire(new Manager(Integer.toString(i), Integer.toString(i), "Manager",
                    Random.rand(15000, 30000)));
        }

        for (int i = 0; i < 10; i++){

            company.hire(new TopManager(Integer.toString(i), Integer.toString(i), "TopManager",
                    Random.rand(20000, 100000)));
        }

        System.out.println();
        System.out.println(company.getTopSalaryStaff(15));
        System.out.println();
        System.out.println(company.getLowestSalaryStaff(30));
        System.out.println();

        company.fireCount(company.getStaff().size() / 2);

        System.out.println(company.getTopSalaryStaff(15));
        System.out.println();
        System.out.println(company.getLowestSalaryStaff(30));
        System.out.println();

    }
}