package com.epam.homework6;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private float price;

    public Book(int id, String name, String author, String publisher, int year, int pages, float price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public Book () { }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public void viewBook () {
        System.out.println("ID = " + id + "; Name = " + name + "; Author = " + author + "; Publisher = " + publisher + "; Year = " + year + "; Pages = " + pages + "; Price = " + price);
    }
}