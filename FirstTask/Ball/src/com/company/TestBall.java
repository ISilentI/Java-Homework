package com.company;

public class TestBall {
    public static void main(String[] args)
    {
        Ball obj1 = new Ball("Blue", 10);
        Ball obj2 = new Ball("Yellow");
        Ball obj3 = new Ball(5);
        obj1.SetSize(20);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}