package library.model;

import library.controller.GenerateID;

/**
 * Created by berloc on 2016.12.17..
 */
public class Book {

    private String bookTitle;
    private String bookAuthor;
    private int bookID;
    private Library library;

    public Book() {
    }

    public Book(String bookTitle, String bookAuthor, Library library) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookID = GenerateID.generateId();
        this.library = library;
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

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

}
