package com.epam.homework6;

public class Books {
    int arraySize;
    Book[] library;

    public Books(int arraySize) {
        this.arraySize = arraySize;
        library = new Book[arraySize];
    }

    public void addBook (int position, String name, String author, String publisher, int year, int pages, float price) {
        Book book = new Book(position, name, author, publisher, year, pages, price);

        library[position] = book;
    }

    public void viewBooks()
    {
        System.out.println("Print list of books in library -> ");
        for(int i=0; i<library.length; i++)
        {
            library[i].viewBook();
        }
    }

    public void changePrice(float percent)
    {
        System.out.println("Incrementing price by " + percent  + "%");
        for(int i=0; i<library.length; i++)
        {
            library[i].setPrice(library[i].getPrice() * (1 + percent/100));
        }
    }

    public void findBookByAuthor(String author)
    {
        System.out.println("Books by " + author  + " -> ");
        for(int i=0; i<library.length; i++)
        {
            if((library[i].getAuthor()).equals(author))
            {
                library[i].viewBook();
            }
        }
    }

    public void findBookByYear(int year)
    {
        System.out.println("Books published on or after " + year  + " -> ");
        for(int i=0; i<library.length; i++)
        {
            if(library[i].getYear() >= year)
            {
                library[i].viewBook();
            }
        }
    }


}
