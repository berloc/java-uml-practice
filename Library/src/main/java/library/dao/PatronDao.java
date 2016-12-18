package library.dao;

import library.model.Book;

/**
 * Created by berloc on 2016.12.17..
 */
public interface PatronDao {

    Book search(int bookID);
    Book search(String title);
    void request(String title);
}
