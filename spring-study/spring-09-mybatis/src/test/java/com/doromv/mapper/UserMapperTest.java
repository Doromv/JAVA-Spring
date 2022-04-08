package com.doromv.mapper;

import com.doromv.pojo.User;
import com.doromv.utils.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-03-01-15:35
 */
public class UserMapperTest {
    @Test
    public void getUserTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml ");
        UserMapper userMapper = context.getBean("UserMapperImpl02", UserMapper.class);
        List<User> user = userMapper.getUser();
        for (User user1 : user) {
            System.out.println(user1);
        }
    }

}
