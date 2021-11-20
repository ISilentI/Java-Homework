//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class TestBook {
    public TestBook() {
    }

    public static void main(String[] args) {
        Book obj1 = new Book("The Catcher in the Rye", 450);
        Book obj2 = new Book("Harry Potter and the Chamber of Secrets");
        Book obj3 = new Book(130);
        obj2.SetPages(83);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
