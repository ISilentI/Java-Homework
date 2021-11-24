package com.company;

public class Dish{
    String material;
    String sort;
    int price;

    public Dish(String material, String sort, int price) {
        this.material = material;
        this.sort = sort;
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public String getMaterial() {
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
        return "Dish -> " + "material: |" + material + "| sort: |" + sort + "| price: |" + price + "| <-";
    }
}