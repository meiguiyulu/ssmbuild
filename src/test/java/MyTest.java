import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Books;
import service.BookServiceImpl;

/**
 * @author LYJ
 * @create 2021-07-10 10:37
 */
public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl serviceImpl = context.getBean("BookServiceImpl", BookServiceImpl.class);
        for (Books books: serviceImpl.queryAllBooks()){
            System.out.println(books);
        }
    }
}
