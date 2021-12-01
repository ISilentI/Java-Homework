package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {

    public void Menu(){}

    public boolean Choosing(String s, int n) {

        switch (n)
        {
            case 1:
            {
                return s.matches(("abcdefghijklmnopqrstuv18340"));
            }
            case 2:
            {
                return s.matches(("[a-fA-F0-9]{2}(:[a-fA-F0-9]{2}){5}"));
            }
            case 3:
            {
                Pattern p = Pattern.compile("\\d\\d.\\d\\d(USD| RU| EU)");Matcher m = p.matcher(s);
                return m.matches();
            }

            default:
            {
                return false;
            }
        }
    }

    public void Price(String s) {

        System.out.println("Result: ");

        int k = 0;
        String[] sort = s.split(", ");
        for (int i = 0; i < sort.length; i++) {
            if (Choosing(sort[i],3)) {

                System.out.println(sort[i]);
                k++;
            }
        }

        if (k == 0) {
            System.out.print("NULL");
        }
    }
}