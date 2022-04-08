import com.doromv.pojo.Student;
import com.doromv.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-02-27-19:25
 */
public class MyTest {
   @Test
    public void Test1(){
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       Student student = (Student) context.getBean("student");
       System.out.println(student.toString());
   }
   @Test
    public void Test2(){
       ApplicationContext context = new ClassPathXmlApplicationContext("UserBeans.xml");
       User user1 = context.getBean("user2", User.class);
       User user2 = context.getBean("user2", User.class);
       System.out.println(user1==user2);
   }
}
