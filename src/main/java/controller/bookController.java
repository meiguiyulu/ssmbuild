package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Books;
import service.BookService;

import java.util.List;

/**
 * @author LYJ
 * @create 2021-07-10 9:04
 */

@Controller
@RequestMapping("/book")
public class bookController {

    // Controller层调Service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    // 查询全部书籍, 并且返回到页面显示结果
    @RequestMapping("/allBook")
    public String QueryAllBooks(Model model){
        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("books", books);
        return "allBooks";
    }

    // 跳转到添加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    // 处理添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook===>" + books);
        bookService.addBook(books);
        return "redirect:/book/allBook"; // 重定向
    }

    // 跳转到修改书籍页面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id, Model model){
        Books book = bookService.queryBookById(id);
        model.addAttribute("QueriedBook", book);
        return "updateBook";
    }

    // 修改书籍
    @RequestMapping("/updateBook")
    public String UpdateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    // 删除书籍
    @RequestMapping("/deleteBook")
    public String DeleteBookById(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    // 搜索书籍
    @RequestMapping("/queryBookByName")
    public String queryBookByName(String queryBookName, Model model){
        List<Books> books = bookService.queryBookByName(queryBookName);
        System.out.println("queryBookByName==>" + books);
        if (books == null){
            model.addAttribute("error", "未查到");
        }else{
            model.addAttribute("books", books);
        }
        return "allBooks";
    }
}
