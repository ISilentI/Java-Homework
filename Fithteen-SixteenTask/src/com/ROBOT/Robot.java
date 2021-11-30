package com.ROBOT;


public class Robot{

    private Thread rightLeg = new Thread(new Leg("RIGHT", this));
    private Thread leftLeg = new Thread(new Leg("LEFT", this));


    public void step() {

        rightLeg.start();
        leftLeg.start();
    }
}