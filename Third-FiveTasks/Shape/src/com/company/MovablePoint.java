package com.company;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;


    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "x = " + x + ", y = " + y + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed;
    }

    @Override
    public void MoveUp() {
        y += ySpeed;
    }
    @Override
    public void MoveDown() {
        y -= ySpeed;
    }
    @Override
    public void MoveLeft() {
        x -= xSpeed;
    }
    @Override
    public void MoveRight() {
        x += xSpeed;
    }
}