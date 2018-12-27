package learn.kj.service.impl;

import learn.kj.dao.BookDao;
import learn.kj.domain.Book;
import learn.kj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao dao;

    public List<Book> findAll() {
        return dao.findAll();
    }
}
