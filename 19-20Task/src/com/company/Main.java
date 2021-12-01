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
        int n = new Scanner(System.in).nextInt();
        AutoNumber num = new AutoNumber();

        for (int i=0;i<n;i++) {

            arr.add(num.Generate());
            System.out.println(arr.get(i));
        }

        Collections.sort(arr,Collections.reverseOrder());

        HashSet<String> h = new HashSet<String>(arr);
        TreeSet ts = new TreeSet(arr);
        Scanner scanner=new Scanner(System.in);

        System.out.println("Number = ");
        String find= scanner.nextLine();

        long time1=System.nanoTime();
        boolean b=arr.contains(find);
        long time2=System.nanoTime();

        System.out.println("Straight --> Elem " + (b?" is found ":" is not found") + " <-- Spent time on it = "+(time2-time1 + "ns"));
        time1=System.nanoTime();

        int u=Collections.binarySearch(arr,find,Collections.reverseOrder());
        time2=System.nanoTime();

        if (u>=0){

            System.out.println("Binary --> Elem is found <-- Spent time on it = " + (time2-time1)+"ns");
        }
        else {

            System.out.println("Binary --> Elem is not found <-- Spent time on it = " + (time2-time1)+"ns");
        }
        time1=System.nanoTime();b=h.contains(find);time2=System.nanoTime();
        System.out.println("HashSet --> Elem " + (b?" is found ":" is not found ") + " <-- Spent time on it " + (time2-time1) + "ns");

        time1=System.nanoTime();
        b=ts.contains(find);
        time2=System.nanoTime();
        System.out.println("TreeSet --> Elem " + (b?" is found ":" is not found ") + " <-- Spent time on it " + (time2-time1) + "ns");
    }
}