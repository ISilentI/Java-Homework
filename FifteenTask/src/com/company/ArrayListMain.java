package com.company;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args){

        ArrayList<String> CarBrands = new ArrayList<String>();

        CarBrands.add("BMW");
        CarBrands.add("Tesla");
        CarBrands.add("Porsche");
        CarBrands.add(1, "Ford");

        System.out.println(CarBrands.get(1));
        CarBrands.set(1, "Aston Martin");

        System.out.printf(" -> Below list with %d elements <- ", CarBrands.size());
        System.out.println();

        for(String brand : CarBrands){

            System.out.println(brand);
        }

        if(CarBrands.contains("McLaren")){

            System.out.println("-> List with McLaren <- ");
        }

        CarBrands.remove("BMW");
        CarBrands.remove(0);

        Object[] carArray = CarBrands.toArray();
        for(Object brand : carArray){

            System.out.println(brand);
        }
    }
}