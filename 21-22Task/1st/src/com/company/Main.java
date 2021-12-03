package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("1 - Real / 2- Complex part of the number: ");
        NumberFactory Numb = new NumberFactory(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
        System.out.println("Complex number: " + Numb.getNum());
    }
}