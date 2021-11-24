package com.company;

public abstract class Dog {
    private int age = 0, height = 0;
    private double weight = 0;
    public Dog(int age, double weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog -> " + this.age + "| Weight: |" + this.weight + "| Height: |" + this.height + "| ";
    }

}