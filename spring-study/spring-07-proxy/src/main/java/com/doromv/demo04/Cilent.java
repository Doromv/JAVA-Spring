package com.doromv.demo04;

import com.doromv.demo02.UserService;
import com.doromv.demo02.UserServiceImpl;

/**
 * @author shkstart
 * @create 2022-02-28-20:58
 */
public class Cilent {
    public static void main(String[] args) {
        //真实角色
        UserService userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userService);
        //动态生成代理类
       UserService proxy = (UserService) pih.getProxy();
        proxy.query();
    }
}
