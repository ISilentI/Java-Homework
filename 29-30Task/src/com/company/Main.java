package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)
    {
        HashMap<String, Integer> exmpl = new HashMap<>();

        (new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))).lines().flatMap(lng ->
                Stream.of(lng.split("[\\p{Punct}\\s]+"))).map(wght -> wght.toLowerCase()).forEach(wght -> {

            if(exmpl.containsKey(wght)){
                exmpl.put(wght, exmpl.get(wght) + 1);
            }
            else{
                exmpl.put(wght, 1);
            }
        });

        exmpl.entrySet().stream().sorted((e1, e2) -> {

            if(e1.getValue() == e2.getValue()){
                return e1.getKey().compareTo(e2.getKey());
            }
            else{
                return e2.getValue().compareTo(e1.getValue());
            }
        }).limit(10).forEach(e -> System.out.println(e.getKey()));
    }
}