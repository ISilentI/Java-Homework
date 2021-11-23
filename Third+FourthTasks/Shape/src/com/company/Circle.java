package com.company;

public class Circle extends Shape {
    protected double radius;

    public Circle()
    {
        this.radius = 10;
        this.color = "Red";
        this.filled = true;
    }
    public Circle(double radius)
    {
        this.radius = radius;
        this.color = "Red";
        this.filled = true;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double GetRadius()
    {
        return radius;
    }
    public void SetRadius(double radius)
    {
        this.radius = radius;
    }
    @Override

    public double GetArea()
    {
        return radius * radius * 3.14;
    }
    @Override
    public double GetPerimeter()
    {
        return radius * 2 * 3.14;
    }

    @Override

    public String toString()
    {
        return "Radius: " + radius + ". Color: " + color + " Filled: " + filled;
    }
}