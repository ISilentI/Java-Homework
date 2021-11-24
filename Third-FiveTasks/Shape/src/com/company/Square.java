package com.company;

public class Square extends Rectangle {
    public Square() {

        this.width = 4;
        this.length = 4;
        this.color = "Green";
        this.filled = true;
    }
    public Square(double side) {

        this.width = side;
        this.length = side;
        this.color = "Green";
        this.filled = true;
    }

    public Square(double side, String color, boolean filled) {

        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double GetSide() {

        return width;
    }

    public void SetSide(double side) {

        this.width = side;
        this.length = side;
    }

    public void SetWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public void SetLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString(){
        return "Side: " + width + ". Color: " + color + " Filled: " + filled;
    }
}