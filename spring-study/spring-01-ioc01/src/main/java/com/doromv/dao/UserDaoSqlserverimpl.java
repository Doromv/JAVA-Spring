package com.doromv.dao;

import lombok.Data;

/**
 * @author shkstart
 * @create 2022-02-27-14:19
 */
@Data
public class UserDaoSqlserverimpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("UserDaoSqlserverimpl");
    }
}
