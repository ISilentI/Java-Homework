package com.CASHMACHINE;

public class Tester {
    public static void test() {
        Person person = new Person("1");
        Thread atm = new Thread(new ATM(person, 180, "deposit"));
        atm.start();
        person.deposit(180);
        System.out.println(person);
    }
}