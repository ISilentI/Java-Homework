package com.company;

import java.util.Scanner;

public class NumberFactory implements StartNumber{

    private String Num, img;
    private int real;

    NumberFactory(int x,int y) {
        setNum(x,y);
    }

    @Override
    public ComplexNum createCompl() {
        return new ComplexNum();
    }

    public RealNum createReal() {
        return new RealNum();
    }

    public String getNum() {

        return this.Num;
    }

    public void setNum(int x,int y) {

        this.img = createCompl().getNum(y);
        this.real = createReal().getNum(x);
        this.Num = this.real + "+" + this.img;
    }
}