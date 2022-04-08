import com.doromv.config.DoromvConfig;
import com.doromv.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-02-28-14:36
 */
public class MyTest {
    @Test
    public void Test(){
       ApplicationContext context = new AnnotationConfigApplicationContext(DoromvConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
