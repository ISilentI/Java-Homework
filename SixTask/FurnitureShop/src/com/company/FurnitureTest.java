package com.company;

public class FurnitureTest {
    public static void main(String[] args) {
        FurnitureShop fs = new FurnitureShop();

        System.out.println();
        Sofa sofa = new Sofa("Red sofa ", 6, 2, 2, 250, 6);
        fs.sellFurniture(sofa, 1899.99);
        System.out.println(sofa);
        System.out.println();

        Cabinet cabinet = new Cabinet("Black nightstand ", 6, 2, 5, 80, 3);
        fs.sellFurniture(cabinet, 999.99);
        System.out.println(cabinet);
    }
}