package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collections.*;
import java.util.List;
import java.lang.Integer;
import java.util.*;



public class Main {

    public static void main(String[] args)
    {

        ArrayList<String> arr = new ArrayList<String>();
        int count = new Scanner(System.in).nextInt();
        AutoNumber num = new AutoNumber();

        for (int i=0; i<count; i++) {

            arr.add(num.Generate());
            System.out.println(arr.get(i));
        }

        Collections.sort(arr,Collections.reverseOrder());

        HashSet<String> HS = new HashSet<String>(arr);
        TreeSet ts = new TreeSet(arr);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number = ");
        String find = scanner.nextLine();

        long time1 = System.nanoTime();
        boolean checker = arr.contains(find);
        long time2 = System.nanoTime();

        System.out.println("Straight --> Elem " + (checker?" is found ":" is not found") + " <-- Spent time on it = " + (time2 - time1 + "ns"));
        time1 = System.nanoTime();

        int pos=Collections.binarySearch(arr,find,Collections.reverseOrder());
        time2 = System.nanoTime();

        if (pos >= 0){

            System.out.println("Binary --> Elem is found <-- Spent time on it = " + (time2 - time1) + "ns");
        }
        else {

            System.out.println("Binary --> Elem is not found <-- Spent time on it = " + (time2 - time1) + "ns");
        }

        time1 = System.nanoTime();
        checker = HS.contains(find);
        time2 = System.nanoTime();
        System.out.println("HashSet --> Elem " + (checker?" is found ":" is not found ") + " <-- Spent time on it " + (time2 - time1) + "ns");

        time1 = System.nanoTime();
        checker = ts.contains(find);
        time2 = System.nanoTime();
        System.out.println("TreeSet --> Elem " + (checker?" is found ":" is not found ") + " <-- Spent time on it " + (time2 - time1) + "ns");
    }
}