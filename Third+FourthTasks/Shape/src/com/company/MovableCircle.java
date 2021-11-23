package com.company;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString()
    {
        return "x = " + center.x + ", y = " + center.y + ", xSpeed = " + center.xSpeed + ", ySpeed = " + center.ySpeed;
    }
    @Override
    public void MoveUp()
    {
        center.y += center.ySpeed;
    }
    @Override
    public void MoveDown()
    {
        center.y -= center.ySpeed;
    }
    @Override
    public void MoveLeft()
    {
        center.x -= center.xSpeed;
    }
    @Override
    public void MoveRight()
    {
        center.x += center.xSpeed;
    }
}