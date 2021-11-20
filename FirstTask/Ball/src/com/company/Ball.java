package com.company;

public class Ball
{
    private String color;
    private int size;

    public Ball(String color, int size)
    {
        this.color = color;
        this.size = size;
    }

    public Ball(String color)
    {
        this.color = color;
        this.size = -1;
    }

    public Ball(int size)
    {
        this.color = "No Info";
        this.size = size;
    }

    public void SetSize(int size)
    {
        this.size = size;
    }

    public String toString()
    {
        return "Color: " + this.color + "; Size: " + this.size;
    }
}