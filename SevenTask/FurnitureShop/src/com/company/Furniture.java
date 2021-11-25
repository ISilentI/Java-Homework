package com.company;

public abstract class Furniture {
    private int color, size, material, price;

    public Furniture(int color, int size, int material, int price) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.price = price;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public int getMaterial() {
        return material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Furniture -> " + " Color: |" + this.color + "| Size: |" + this.size + "| Material: |" + this.material +
                "| <- ";
    }
}