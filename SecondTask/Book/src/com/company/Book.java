package com.company;

public class Book {
    private String author, title, date;
    private int pages;

    public Book(String author, String title, String date, int pages){
        this.author = author;
        this.title = title;
        this.date = date;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString(){
        return "Author: " + this.author + " Title: " + this.title +
                " Date: " + this.date + " Pages: " + this.pages;
    }
}
