package com.imooc.mybatis;

import com.imooc.myBatis.entity.Goods;
import com.imooc.myBatis.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

public class MyBatisTestor {
    @Test
    public void testSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();

            }
        }
    }

    @Test
    public void testMyBatisUtils() throws Exception {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.openSession();
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            throw e;
        } finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void selectAll() throws Exception {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.openSession();
            List<Goods> list = sqlSession.selectList("goods.selectAll");
            for (Goods g:list){
                System.out.println(g.getTitle());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }

    }
}
