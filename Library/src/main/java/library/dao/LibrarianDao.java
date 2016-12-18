package library.dao;

import library.model.Book;

/**
 * Created by berloc on 2016.12.17..
 */
public interface LibrarianDao {

    Boolean issueStatus();
    Book getBook(String title);
    Book getBook(int bookID);
    Boolean verifyMember(int patronID);
    Boolean issueBook(String issue);
}
