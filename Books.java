package com.epam.homework8;

import java.util.Arrays;

public class Books implements Cloneable{
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
            System.out.println(library[i].toString());
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
                System.out.println(library[i].toString());
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
                System.out.println(library[i].toString());
            }
        }
    }

    public void sortByAuthor()
    {
        Arrays.sort(library, Book.AuthorComparator);
    }


    public void sortByPublisher()
    {
        Arrays.sort(library, Book.PublisherComparator);
    }

    public void sortByPrice()
    {
        Arrays.sort(library, Book.PriceComparator);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
