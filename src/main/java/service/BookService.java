package service;

import org.apache.ibatis.annotations.Param;
import pojo.Books;

import java.util.List;

/**
 * @author LYJ
 * @create 2021-07-09 20:22
 */
public interface BookService {
    // 增加一本书
    int addBook(Books books);
    // 删除一本书
    int deleteBookById(int id);

    // 更新一本书
    int updateBook(Books books);

    // 查询一本书
    Books queryBookById(int id);

    // 查询全部书
    List<Books> queryAllBooks();

    // 根据书名搜索书
    List<Books> queryBookByName(String queryBookByName);
}
