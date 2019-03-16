package com.epam.homework6;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many books do you want to enter?");
        int numberOfBooks = myObj.nextInt();
        myObj.nextLine();
        Books library = new Books(numberOfBooks);

        for(int i=0; i<numberOfBooks; i++){
            System.out.println("Adding book " + (i + 1) + " to library ");

            System.out.println("What is the book's name?");
            String bookName = myObj.nextLine();

            System.out.println("What is the book's author?");
            String authorName = myObj.nextLine();

            System.out.println("What is the book's publisher?");
            String publisherName = myObj.nextLine();

            System.out.println("What is the book's year?");
            int bookYear = myObj.nextInt();

            System.out.println("How many pages does the book have?");
            int bookPages = myObj.nextInt();

            System.out.println("What is the book's price?");
            float bookPrice = myObj.nextFloat();
            myObj.nextLine();

            library.addBook(i, bookName, authorName, publisherName, bookYear, bookPages, bookPrice);
        }
        library.viewBooks();

        System.out.println("Which Author do you want to search for?");
        library.findBookByAuthor(myObj.nextLine());

        System.out.println("Find books published after which year?");
        library.findBookByYear(myObj.nextInt());

        System.out.println("How many percent to increment price by?");
        library.changePrice(myObj.nextFloat());
        library.viewBooks();

    }
}