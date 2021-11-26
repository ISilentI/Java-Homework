package com.company;

public class Random {

    public static double rand(double min, double max) {

        return Math.random() * (max - min) + min;
    }
}