package com.doromv.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author shkstart
 * @create 2022-03-01-15:42
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            String resource="mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static SqlSession getSqlsession(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }
}
