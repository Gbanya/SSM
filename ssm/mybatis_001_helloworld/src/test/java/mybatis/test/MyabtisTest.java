package mybatis.test;

import com.yuan.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: gbanya
 * @create: 2023-07-19 22:04
 * @Version 1.0
 **/
public class MyabtisTest {

    @Test
    public void testInsert() throws IOException {
        // 获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // SqlSession sqlSession = sqlSessionFactory.openSession()；获取Sql的会话对象SqlSession（不会自动提交事务），是Mybatis提供的操作数据库的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 获取UserMapper的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 调用mapper接口中的方法，实现添加用户信息的功能
        userMapper.insertUser();
        // 提交事务
        //sqlSession.commit();
        // 关闭sqlsession
        sqlSession.close();


    }
}
