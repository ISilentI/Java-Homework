package com.company;

public class Bed extends Furniture{
    private  int springType, legsType;

    public Bed(int color, int size, int material, int springType, int legsType) {
        super(color, size, material, material*size*100);
        this.springType = springType;
        this.legsType = legsType;
    }

    public void setSpringType(int springType) {
        this.springType = springType;
    }

    public int getSpringType() {
        return springType;
    }

    public void setLegsType(int legsType) {
        this.legsType = legsType;
    }

    public int getLegsType() {
        return legsType;
    }

    @Override
    public String toString() {
        return super.toString() + "Bed: -> Springs: |" + springType + "| Legs: |" + legsType + "| <-";
    }
}