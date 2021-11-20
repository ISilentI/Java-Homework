package com.company;

public class TestBall {
    public static void main(String[] args)
    {
        Ball obj1 = new Ball("Green", 20);
        Ball obj2 = new Ball("Red");
        Ball obj3 = new Ball(10);
        obj1.SetSize(15);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}