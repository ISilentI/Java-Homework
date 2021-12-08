package com.company;

import java.io.File;

public class Main
{
    public static void main(String[] args)
    {

        int Processors = Runtime.getRuntime().availableProcessors();
        String srcFolder = "imgs";
        String dstFolder = "dst";
        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();
        int middle = files.length / Processors;
        System.out.println("-> Streams <- ");
        long start = System.currentTimeMillis();

        for (int i = 0; i < Processors - 1; i++){
            File[] files1 = new File[middle];

            System.arraycopy(files, 0 + (middle * i), files1, 0, middle);
            WorkPlace cutter1 = new WorkPlace(files1, dstFolder, start);

            new Thread(cutter1).start();
        }

        File[] files2 = new File[files.length - middle * (Processors - 1)];
        System.arraycopy(files, middle * (Processors - 1), files2, 0, files2.length);
        WorkPlace png2 = new WorkPlace(files2, dstFolder, start);
        new Thread(png2).start();
    }
}