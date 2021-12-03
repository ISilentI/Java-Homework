package com.company;

import java.util.Scanner;

public class Client{

    public void Client(){}

    public void Item()
    {
        ChairFactory mChair = new ChairFactory();
        int k = 1;
        while (k > 0)
        {

            System.out.println("Type '1' - Victorian chair ... " );
            System.out.println("Type '2' - Multifunction chair ... ");
            System.out.println("Type '3' - Magic chair ... ");
            System.out.println("Type '4' - Exit.");

            switch(new Scanner(System.in).nextInt())
            {
                case 1:
                {
                    mChair.createVict();
                    break;
                }
                case 2:
                {
                    mChair.createMult();
                    break;
                }
                case 3:
                {
                    mChair.createMag();
                    break;
                }
                case 4:
                {
                    k = 0;
                    break;
                }
                default:
                {
                    k = 1;
                    System.out.println("Error. Write a number from the suggested list ...");
                    System.out.println();
                }
            }
        }
    }
}