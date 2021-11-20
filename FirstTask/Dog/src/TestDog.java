package com.company;

public class TestDog
{
    public static void main(String[] args)
    {
        Dog obj1 = new Dog("Mike", 2);
        Dog obj2 = new Dog("Helen", 7);
        Dog obj3 = new Dog();
        obj3.SetAge(4);
        obj3.SetName("Alice");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}