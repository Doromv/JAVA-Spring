package com.doromv.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author shkstart
 * @create 2022-02-28-19:40
 */
//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    @Override
    //处理代理实例，并返回结果
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object invoke = method.invoke(rent, objects);
        seeHouse();
        return invoke;
    }
    public void seeHouse(){
        System.out.println("中介带看房子");
    }
}
