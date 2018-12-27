package learn.kj.service;

import learn.kj.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
}
