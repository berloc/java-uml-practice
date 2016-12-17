package library.dao;

import library.model.Book;

/**
 * Created by berloc on 2016.12.17..
 */
public interface LibrarianDao {

    Boolean issueStatus();
    Book searchBook(int bookID);
    Boolean verifyMember(int patronID);
}
