package library.dao;

import library.model.Book;
import library.model.Librarian;
import library.model.Patron;

/**
 * Created by berloc on 2016.12.17..
 */
public interface LibraryDao {

    void addToBookList(Book book);
    void addToLibrarianList(Librarian librarian);
    Librarian getLibrarianByName(String name);
    void addToPatronList(Patron patron);
    Patron getPatron(String name);
    Patron getPatron(int patronID);

}
