package library.dao.implementation;

import library.dao.LibraryDao;
import library.model.Book;
import library.model.Librarian;
import library.model.Patron;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by berloc on 2016.12.17..
 */
public class LibraryDaoMem implements LibraryDao {

    private static LibraryDaoMem INSTANCE;
    private List<Book>bookList = new ArrayList();
    private List<Librarian>librarianList = new ArrayList();
    private List<Patron>patronList = new ArrayList();
    private List<String>requestList = new ArrayList();

    public static LibraryDaoMem getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LibraryDaoMem();
        }
        return INSTANCE;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addToBookList(Book book) {
        bookList.add(book);
    }


    public List<Librarian> getLibrarianList() {
        return librarianList;
    }

    public void addToLibrarianList(Librarian librarian) {
        librarianList.add(librarian);
    }

    public Librarian getLibrarianByName(String name) {
        for (Librarian librarian: getLibrarianList()) {
            if (librarian.getName().equals(name)) {
                return  librarian;
            }
        }
        System.out.println("No librarian has found with this name.");
        return null;
    }

    public List<Patron> getPatronList() {
        return patronList;
    }

    public void addToPatronList(Patron patron) {
        patronList.add(patron);
    }

    public Patron getPatron(String name) {
        for (Patron patron: getPatronList()) {
            if (patron.getName().equals(name)) {
                return patron;
            }
        }
        System.out.println("No patron has found with this name.");
        return null;
    }

    public Patron getPatron(int patronID) {
        for (Patron patron: getPatronList()) {
            if (patron.getPatronID() == patronID) {
                return patron;
            }
        }
        System.out.println("No patron has found with this ID.");
        return null;
    }

    public List<String> getRequestList() {
        return requestList;
    }
}
