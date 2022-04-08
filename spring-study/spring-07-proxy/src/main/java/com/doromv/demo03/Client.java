package com.doromv.demo03;

/**
 * @author shkstart
 * @create 2022-02-28-19:51
 */
public class Client {
    public static void main(String[] args) {
        //生成真实角色
        Host1 host1 = new Host1();
        //生成创建代理角色的类
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象！
        pih.setRent(host1);
        //生成代理角色
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
