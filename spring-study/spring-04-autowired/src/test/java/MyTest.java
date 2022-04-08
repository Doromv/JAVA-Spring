import com.doromv.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-02-28-9:18
 */
public class MyTest {
    @Test
   public void Test(){
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = context.getBean("people", People.class);
        people.getDog().shout();
        people.getCat().shout();
    }
}
