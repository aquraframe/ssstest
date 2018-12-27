package learn.kj.dao;

import learn.kj.domain.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookDao {

//    @Select("select * from book")
    List<Book> findAll();
}
