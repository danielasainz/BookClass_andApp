package com.Sainz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        String result = "";
        Book newBook;

        ArrayList<Book> books = new ArrayList<>();


        do {
            newBook = new Book();
            System.out.println('\n' + "Enter information about a book");

            System.out.println("Enter the book's title: ");
            newBook.setBookTitle(keyboard.nextLine());

            System.out.println("Enter the book's author: ");
            newBook.setBookAuthor(keyboard.nextLine());

            System.out.println("Enter the book's description: ");
            newBook.setBookDescription(keyboard.nextLine());

            System.out.println("Enter the book's price: ");
            newBook.setBookPrice(keyboard.nextLine());

            System.out.println("Is the book in stock? ");
            newBook.setInStock(keyboard.nextLine());


            System.out.println('\n' + "The book's information is: " + '\n' + "Book title: " + newBook.getBookTitle()
                    + '\n' + "Book author: " + newBook.getBookAuthor() + '\n' + "Book description: " + newBook.getBookDescription()
                    + '\n' + "Book price: " + newBook.getBookPrice() + '\n' + "Is the book in stock?" + " " + newBook.getInStock());

            books.add(newBook);

            System.out.println('\n' + "Do you want to enter another book? (Y/N)");
            result = keyboard.nextLine();

            if (result.equalsIgnoreCase("Y") || result.equalsIgnoreCase("Yes")) {
                //doesn't make sense below - why? Wouldn't that mean "We're done, stop running the program!"
                done = true;
            } else {
                done = false;
            }
            //don't understand purpose of while below...
        } while (done);

        System.out.println("==================");
        System.out.println("Information about a book");
        for (Book eachBook : books)
        {
            System.out.println('\n' + "Book title: " + eachBook.getBookTitle() + '\n' + "Book author: " + eachBook.getBookAuthor()
                    + '\n' + "Book description: " + eachBook.getBookDescription() + '\n' + "Book price: " + eachBook.getBookPrice() +
                    '\n' + "If book is in stock: " + eachBook.getInStock());
        }
    }
}



