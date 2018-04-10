package com.Sainz;

/*
Modify your existing application. Change the Integer to a Book and prompt the user to enter the title, author, description, price and inStock. The user should be able to enter as many books as they wish.
Create a Book class that allows for Book title, author, description, price and isInStock variables
The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method called getDisplayText() which prints the author, title and description.
The application shall also contain getters and setters for each private member variable.

**Create another class called BookApp**
 which contains the main method. In the main method you shall create an instance of a Book and print the Author, Title and Description.
Publish your solution to GitHub and submit your GitHub url as the assignment.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        // ? boolean inStock;
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
            //don't understand purpose of while below... sorry, Dave.
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



