package com.company;

public class ChairFactory implements Chair {

    @Override
    public Victorian createVict() {
        return new VictorianChair();
    }

    @Override
    public Multifunction createMult() {
        return new MultifunctionChair();
    }

    @Override
    public Magic createMag() {
        return new MagicChair();
    }
}