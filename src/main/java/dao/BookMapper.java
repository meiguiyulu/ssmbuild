package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Books;

import java.util.List;

/**
 * @author LYJ
 * @create 2021-07-09 19:47
 */
public interface BookMapper {

    // 增加一本书
    int addBook(Books books);
    // 删除一本书
    int deleteBookById(@Param("bookId") int id);

    // 更新一本书
    int updateBook(Books books);

    // 查询一本书
    Books queryBookById(@Param("bookId")int id);

    // 查询全部书
    List<Books> queryAllBooks();

    // 根据书名搜索书
    List<Books> queryBookByName(@Param("bookName") String queryBookByName);

}
