package com.company;

public class Table extends Furniture{
    private int legsCount, legsType, height;

    public Table(int color, int size, int material, int legsCount, int legsType, int height) {
        super(color, size, material, size*material*100);
        this.legsCount = legsCount;
        this.legsType = legsType;
        this.height = height;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setLegsType(int legsType) {
        this.legsType = legsType;
    }

    public int getLegsType() {
        return legsType;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {

        return super.toString() + "Table: -> Count of legs: |" + legsCount + "| Type of legs: |" + legsType +
                "| Height: |" + height + "| <-";
    }
}