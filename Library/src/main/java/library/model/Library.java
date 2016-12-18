package library.model;

import library.controller.GenerateID;

/**
 * Created by berloc on 2016.12.17..
 */
public class Library {

    private String location;
    private int bookID;


    public Library() {
    }

    public Library(String location) {
        this.location = location;
        this.bookID = GenerateID.generateId();
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
}
