package com.doromv.demo04;

import com.doromv.demo03.Rent;

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
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    //处理代理实例，并返回结果
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(target, objects);
        return invoke;
    }
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
