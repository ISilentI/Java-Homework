package com.company;

import java.util.Comparator;

public class SComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        return ((Student) o1).getGPA() - ((Student) o2).getGPA();
    }
}