import com.doromv.mapper.UserMapper;
import com.doromv.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Doromv
 * @create 2022-03-01-21:52
 */
public class MyTest {
    @Test
    public void getUsrTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = context.getBean("UserMapperImpl", UserMapper.class);
        List<User> user = userMapperImpl.getUser();
        for (User user1 : user) {
            System.out.println(user1);
        }
    }
    @Test
    public void addUserTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = context.getBean("UserMapperImpl", UserMapper.class);
        userMapperImpl.addUser(new User(6,"小王","wwdads"));
    }
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = context.getBean("UserMapperImpl", UserMapper.class);
        userMapperImpl.deleteUser(6);
    }
}

