package com.company;

public class DishTest {

    public static void main(String[] args) {
        Dish dish = new Fork("metalic", "fork", 79);
        System.out.println(dish);
        dish.setPrice(70);
        System.out.println(dish);

        System.out.println();

        dish = new Plate("ceramics", "plate", 399);
        System.out.println(dish);
        dish.setPrice(250);
        System.out.println(dish);

        System.out.println();

        dish = new Spoon("metalic", "spoon", 69);
        System.out.println(dish);
        dish.setPrice(75);
        System.out.println(dish);
    }
}