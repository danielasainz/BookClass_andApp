package com.Sainz;

/*
The Book class shall contain private member variables, a default constructor, an overloaded constructor and a ***method called getDisplayText()*** which prints the author, title and description.
The application shall also contain getters and setters for each private member variable.
 */

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private String bookPrice;
    private String inStock;

//Not returning anything so you can use void (?)
    public void getDisplayText() {
        System.out.println(getBookAuthor());
        System.out.println(getBookTitle());
        System.out.println(getBookDescription());
    }
    //default constructor
    public Book () {
    }

    //overloaded constructor
    public Book(String bookTitle, String bookAuthor, String bookDescription, String bookPrice, String inStock) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookDescription = bookDescription;
        this.bookPrice = bookPrice;
        this.inStock = inStock;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }
}
