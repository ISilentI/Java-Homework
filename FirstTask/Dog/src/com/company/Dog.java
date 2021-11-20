package com.company;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Dog(String name)
    {
        this.name = name;
        age = 0;

    }
    public Dog()
    {
        name = "Null";
        age = 0;
    }
    public void SetAge(int age)
    {
        this.age = age;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public String GetName(String name)
    {
        return name;
    }

    public int GetAge()
    {
        return age;
    }

    public String toString()
    {
        return "Name: " + this.name + ". Age: " + this.age;
    }

}