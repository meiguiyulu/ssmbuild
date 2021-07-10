package service;

import dao.BookMapper;
import pojo.Books;

import java.util.List;

/**
 * @author LYJ
 * @create 2021-07-09 20:23
 */
public class BookServiceImpl implements BookService{

    // Service层要调dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    @Override
    public List<Books> queryBookByName(String queryBookByName) {
        return bookMapper.queryBookByName(queryBookByName);
    }
}
