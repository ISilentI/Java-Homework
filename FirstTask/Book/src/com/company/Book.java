//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Book {
    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public Book(String name) {
        this.name = name;
        this.pages = -1;
    }

    public Book(int pages) {
        this.name = "No Info";
        this.pages = pages;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetPages(int pages) {
        this.pages = pages;
    }

    public String GetName() {
        return this.name;
    }

    public int GetPages() {
        return this.pages;
    }

    public String toString() {
        return "Name: " + this.name + "; Pages: " + this.pages;
    }
}