package com.doromv.pojo;

import lombok.Data;

/**
 * @author shkstart
 * @create 2022-02-27-14:49
 */
@Data
public class User {
    public User(String name) {
        this.name = name;
    }

    private String name;
    public void show(){
        System.out.println("name="+name);
    }
}
