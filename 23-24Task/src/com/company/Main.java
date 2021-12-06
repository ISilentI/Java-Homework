package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.lang.Exception;

public class Main {
    public static void main(String[] args)
    {
        final String filename = "movementList.csv";
        new CSVParse().test(filename);
        HTML html=new HTML();

        System.out.println("\n-----------------\n-> Code <-\n-----------------\n"+html.code()
                + "\n\n-----------------\n-> Pictures links <-\n-----------------\n");
        html.imgsrc();html.Downloading();System.out.println("\n----------------\n->  Uploaded files <-\n----------------");
        html.showLoadings();
    }
}