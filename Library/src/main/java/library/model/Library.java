package library.model;

/**
 * Created by berloc on 2016.12.17..
 */
public class Library {

    private String location;
    private int bookID;


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
}
