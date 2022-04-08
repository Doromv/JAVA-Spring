package com.doromv.service;

import com.doromv.dao.UserDao;

/**
 * @author shkstart
 * @create 2022-02-27-14:36
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}
