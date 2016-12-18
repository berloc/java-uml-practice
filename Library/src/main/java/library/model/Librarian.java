package library.model;

import library.controller.GenerateID;

/**
 * Created by berloc on 2016.12.17..
 */
public class Librarian {

    private String name;
    private int librarianID;
    private Library library;



    public Librarian() {
    }

    public Librarian(String name) {
        this.name = name;
        this.librarianID = GenerateID.generateId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Library getLibrary() {
        return library;
    }

}
