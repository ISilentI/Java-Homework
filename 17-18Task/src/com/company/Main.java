package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Menu point = new Menu();

        System.out.println("-> Task №1 <- " );
        System.out.println("Right string: abcdefghijklmnopqrstuv18340 ");
        System.out.println(point.Choosing("abcdefghijklmnopqrstuv18340", 1));
        System.out.println();
        System.out.println("NOT Right string: abcdefghijklmnoasdfasdpqrstuv18340");
        System.out.println(point.Choosing("abcdefghijklmnoasdfasdpqrstuv18340", 1));
        System.out.println();


        System.out.println("-> Task №2 <- " );
        System.out.println("Right string: aE:dC:cA:56:76:54");
        System.out.println(point.Choosing("aE:dC:cA:56:76:54", 2));
        System.out.println();
        System.out.println("NOT Right string: 01:23:45:67:89:Az");
        System.out.println(point.Choosing("01:23:45:67:89:Az", 2));
        System.out.println();


        System.out.println("-> Task №3 <- " );
        System.out.println("Right string: 23.78 USD, 22 UDD, 0.002 USD,22.22 RU, 33.33 EU ");
        point.Price("23.78 USD, 22 UDD, 0.002 USD, 22.22 RU, 33.33 EU");
        System.out.println();

    }
}