package com.company;

public class Bulldog extends Dog {

    private String power;

    public Bulldog(int age, double weight, int height, String power){
        super(4, 22.0, 36);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString(){
            return "Bulldog: " + super.toString() + " Power: |" + this.power + "| ";
    }

}
