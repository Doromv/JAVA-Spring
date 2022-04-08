package com.doromv.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-02-27-14:39
 */
public class MyTest {
@Test
    public void UserServiceTest(){
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
    userService.getUser();
}
}
