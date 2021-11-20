//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class TestBook {
    public TestBook() {
    }

    public static void main(String[] args) {
        Book obj1 = new Book("Never", 2000);
        Book obj2 = new Book("Ever");
        Book obj3 = new Book(10);
        obj2.SetPages(20);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
