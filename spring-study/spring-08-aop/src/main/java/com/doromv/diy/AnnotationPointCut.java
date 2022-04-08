package com.doromv.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author shkstart
 * @create 2022-03-01-9:16
 */
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.doromv.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("======方法执行前======");
    }
    @After("execution(* com.doromv.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("======方法执行后======");
    }
    @Around("execution(* com.doromv.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");
        Signature signature = pjp.getSignature();
        System.out.println("singnature:"+signature);
        Object proceed = pjp.proceed();
        System.out.println("环绕后 ");
        System.out.println(proceed);
    }
}
