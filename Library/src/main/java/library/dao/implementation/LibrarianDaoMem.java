package library.dao.implementation;

import library.dao.LibrarianDao;
import library.model.Book;
import library.model.Patron;

/**
 * Created by berloc on 2016.12.17..
 */
public class LibrarianDaoMem implements LibrarianDao {

    private static LibrarianDaoMem INSTANCE;

    public static LibrarianDaoMem getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LibrarianDaoMem();
        }
        return INSTANCE;
    }


    public Boolean issueStatus() {
        return null;
    }

    public Book getBook(String title) {
        for (Book book: LibraryDaoMem.getInstance().getBookList()) {
            if (book.getBookTitle().equals(title)) {
                return book;
            }
        }
        System.out.println("No book has found with this title.");
        return null;
    }

    public Book getBook(int bookID) {
        for (Book book: LibraryDaoMem.getInstance().getBookList()) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        System.out.println("No book has found with this ID.");
        return null;
    }

    public Boolean verifyMember(int patronID) {
        for (Patron patron: LibraryDaoMem.getInstance().getPatronList()) {
            if (patron.getPatronID() == patronID) {
                System.out.println("Verified member!");
                return true;
            }
        }
        System.out.println("No patron has found with this ID.");
        return false;
    }

    public Boolean issueBook(String issue) {
        return issue.equals("yes");
    }
}
