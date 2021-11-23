package com.company;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Circle(2.5, "Red", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.GetArea()); // which version?
        System.out.println(s1.GetPerimeter()); // which version?
        System.out.println(s1.GetColor());
        System.out.println(s1.IsFilled());


        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.GetArea());
        System.out.println(c1.GetPerimeter());
        System.out.println(c1.GetColor());
        System.out.println(c1.IsFilled());
        System.out.println(c1.GetRadius());

        Shape s3 = new Rectangle(1.5, 3.0, "Red", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.GetArea());
        System.out.println(s3.GetPerimeter());
        System.out.println(s3.GetColor());


        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.GetArea());
        System.out.println(r1.GetColor());
        System.out.println(r1.GetLength());

        Shape s4 = new Square(2.3); // Upcast
        System.out.println(s4);
        System.out.println(s4.GetArea());
        System.out.println(s4.GetColor());

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.GetArea());
        System.out.println(r2.GetColor());
        System.out.println(r2.GetLength());

// Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.GetArea());
        System.out.println(sq1.GetColor());
        System.out.println(sq1.GetSide());
        System.out.println(sq1.GetLength());

        System.out.println(" ");
        MovablePoint mp = new MovablePoint(8, 8, 4, 4);
        System.out.println(mp.toString());
        mp.MoveDown();
        mp.MoveLeft();
        System.out.println(mp.toString());


        System.out.println(" ");
        MovableCircle mc = new MovableCircle(8, 8, 4, 4, 10);
        System.out.println(mc.toString());
        mc.MoveDown();
        mc.MoveLeft();
        System.out.println(mc.toString());

        System.out.println(" ");
        MovableRectangle mr = new MovableRectangle(-8, 8, 12, -12, 10, 10);
        System.out.println(mr.toString());
        mr.MoveDown();
        mr.MoveLeft();
        System.out.println(mr.toString());
    }
}