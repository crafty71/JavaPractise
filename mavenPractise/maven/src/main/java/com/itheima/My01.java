package com.itheima;

import com.itheima.mapper.User;
import com.itheima.mapper.UserMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class My01 {

  public static void main(String[] args) throws IOException {
//1. ����mybatis�ĺ��������ļ�����ȡ SqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//2. ��ȡSqlSession����������ִ��sql
    SqlSession sqlSession = sqlSessionFactory.openSession();
//3. ִ��sql
//3.1 ��ȡUserMapper�ӿڵĴ������
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    List<User> users = userMapper.selectAll();
    System.out.println(users);
//4. �ͷ���Դ
    sqlSession.close();
  }

}
