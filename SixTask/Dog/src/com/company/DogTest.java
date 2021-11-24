package com.company;

public class DogTest {
    public static void main(String[] args) {

        Bulldog bd = new Bulldog(4, 22.0, 36, "Strong");
        bd.setPower(bd.getPower());
        System.out.println(bd);

        Spitz sp = new Spitz(2, 2.2, 18, "Beautiful (❍ᴥ❍ʋ)");
        sp.setCute(sp.getCute());
        System.out.println(sp);
    }
}