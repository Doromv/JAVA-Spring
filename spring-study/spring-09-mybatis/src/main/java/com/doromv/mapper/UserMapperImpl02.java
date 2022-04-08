package com.doromv.mapper;

import com.doromv.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-03-01-20:23
 */
public class UserMapperImpl02 extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> getUser() {
        return getSqlSession().getMapper(UserMapper.class).getUser()  ;
    }
}
