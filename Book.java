package com.epam.homework8;

import java.util.Comparator;

public class Book implements Comparable<Book>{
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

    @Override
    public String toString () {
        return "ID = " + id + "; Name = " + name + "; Author = " + author + "; Publisher = " + publisher + "; Year = " + year + "; Pages = " + pages + "; Price = " + price;
    }

    public int compareTo(Book compareBook)
    {
        int compareYear = ((Book) compareBook).getYear();
        return this.year - compareYear;
    }

    public static Comparator<Book> AuthorComparator = new Comparator<Book>()
    {
        public int compare(Book book1, Book book2)
        {
            String Author1 = book1.getAuthor().toUpperCase();
            String Author2 = book2.getAuthor().toUpperCase();
            return Author1.compareTo(Author2);
        }
    };

    public static Comparator<Book> PublisherComparator = new Comparator<Book>()
    {
        public int compare(Book book1, Book book2)
        {
            String Publisher1 = book1.getPublisher().toUpperCase();
            String Publisher2 = book2.getPublisher().toUpperCase();
            return Publisher1.compareTo(Publisher2);
        }
    };

    public static Comparator<Book> PriceComparator = new Comparator<Book>()
    {
        public int compare(Book book1, Book book2)
        {
            float Price1 = book1.getPrice();
            float Price2 = book2.getPrice();
            return (int)(Price1 - Price2);
        }
    };
}
