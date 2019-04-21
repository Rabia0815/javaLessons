package com.epam.homework8;

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many books do you want to enter?");
        String numberOfBooks = myObj.nextLine();
        while(!Validator.validateInteger(numberOfBooks))
        {
            System.out.println("How many books do you want to enter?");
            numberOfBooks = myObj.nextLine();
        }
        Books library = new Books(Integer.parseInt(numberOfBooks));


        for(int i=0; i<Integer.parseInt(numberOfBooks); i++){
            System.out.println("Adding book " + (i + 1) + " to library ");

            System.out.println("What is the book's name?");
            String bookName = myObj.nextLine();

            System.out.println("What is the book's author?");
            String authorName = myObj.nextLine();

            System.out.println("What is the book's publisher?");
            String publisherName = myObj.nextLine();

            System.out.println("What is the book's year?");
            String bookYear = myObj.nextLine();
            while(!Validator.validateInteger(bookYear))
            {
                System.out.println("What is the book's year?");
                bookYear = myObj.nextLine();
            }

            System.out.println("How many pages does the book have?");
            String bookPages = myObj.nextLine();
            while(!Validator.validateInteger(bookPages))
            {
                System.out.println("How many pages does the book have?");
                bookPages = myObj.nextLine();
            }

            System.out.println("What is the book's price?");
            String bookPrice = myObj.nextLine();
            while(!Validator.validateFloat(bookPrice))
            {
                System.out.println("What is the book's price?");
                bookPrice = myObj.nextLine();
            }

            library.addBook(i, bookName, authorName, publisherName, Integer.parseInt(bookYear), Integer.parseInt(bookPages), Float.parseFloat(bookPrice));
        }
        library.viewBooks();

        try
        {
            System.out.println("Sort by Author");
            Books library2 = (Books)library.clone();
            library2.sortByAuthor();
            library2.viewBooks();

            System.out.println("Sort by Publisher");
            Books library3 = (Books)library.clone();
            library3.sortByPublisher();
            library3.viewBooks();

            Books library4 = (Books)library.clone();
            System.out.println("Sort by Price");
            library4.sortByPrice();
            library4.viewBooks();

            System.out.println("Original Array");
            library.viewBooks();
        }
        catch (Exception e){}

        System.out.println("Which Author do you want to search for?");
        library.findBookByAuthor(myObj.nextLine());

        System.out.println("Find books published after which year?");
        library.findBookByYear(myObj.nextInt());

        System.out.println("How many percent to increment price by?");
        library.changePrice(myObj.nextFloat());
        library.viewBooks();

    }
}
