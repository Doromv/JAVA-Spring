package com.doromv.mapper;

import com.doromv.pojo.User;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-03-01-15:32
 */
public interface UserMapper {
    public List<User> getUser();
    public int addUser(User user);
    public int deleteUser(int id);
}
