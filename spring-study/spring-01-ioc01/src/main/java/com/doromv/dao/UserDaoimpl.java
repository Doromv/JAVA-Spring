package com.doromv.dao;

import lombok.Data;

/**
 * @author shkstart
 * @create 2022-02-27-14:18
 */
@Data
public class UserDaoimpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("UserDaoimpl");
    }
}
