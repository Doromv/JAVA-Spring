package com.doromv.demo02;

/**
 * @author shkstart
 * @create 2022-02-28-15:49
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
        userServiceProxy.delete();
        userServiceProxy.update();
        userServiceProxy.query();
    }
}
