package com.company;


public class Student implements Comparable {

    private int iDNumber;
    private int GPA;

    public Student(int iDNumber, int GPA) {
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student: -> " + "Id: |" + iDNumber + "| GPA: |" + GPA + "| <-";
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Student))
            throw new IllegalArgumentException("Объект не является студентом!");
        // < 0 -> o, 0 -> ==, >0 -> this;
        return this.iDNumber - ((Student) o).iDNumber;
    }
}