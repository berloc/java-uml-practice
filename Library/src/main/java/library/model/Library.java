package library.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by berloc on 2016.12.17..
 */
public class Library {

    private String location;
    private int bookID;
    private List<Book>bookList = new ArrayList<Book>();
    private List<Librarian>librarianList = new ArrayList<Librarian>();

    public Library() {
    }

    public Library(String location, int bookID) {
        this.location = location;
        this.bookID = bookID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getbookID() {
        return bookID;
    }

    public void setbookID(int bookID) {
        this.bookID = bookID;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }


    public List<Librarian> getLibrarianList() {
        return librarianList;
    }

    public void setLibrarianList(List<Librarian> librarianList) {
        this.librarianList = librarianList;
    }

    @Override
    public String toString() {
        return "Library" +
                "location: " + location + '\'' +
                ", bookID: " + bookID +
                ", bookList: " + bookList +
                ", librarianList: " + librarianList;
    }
}
