package com.doromv.mapper;

import com.doromv.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-03-01-17:39
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> getUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(new User(6,"小可","wwdads"));
        mapper.deleteUser(6);
        return mapper.getUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
