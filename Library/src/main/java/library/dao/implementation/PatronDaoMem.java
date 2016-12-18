package library.dao.implementation;

import library.dao.PatronDao;
import library.model.Book;

/**
 * Created by berloc on 2016.12.17..
 */
public class PatronDaoMem implements PatronDao {



    public Book search(int bookID) {
        for (Book book: LibraryDaoMem.getInstance().getBookList()) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        System.out.println("No book has found with this id.");
        return null;
    }

    public Book search(String title) {
        for (Book book: LibraryDaoMem.getInstance().getBookList()) {
            if (book.getBookTitle().equals(title)) {
                return book;
            }
        }
        System.out.println("No book has found with this title.");
        return null;
    }

    public void request(String title) {
        LibraryDaoMem.getInstance().getRequestList().add(title);
    }

}
