package com.doromv.diy;

import java.sql.SQLOutput;

/**
 * @author shkstart
 * @create 2022-03-01-8:58
 */
public class DiyPointCut {
    public void before(){
        System.out.println("======方法执行前======");
    }
    public void after(){
        System.out.println("======方法执行后======");
    }
}

