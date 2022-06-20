package com.itheima;

import com.itheima.mapper.User;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisDemo {

  public static void main(String[] args) throws IOException {
//1. ����mybatis�ĺ��������ļ�����ȡ SqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new
        SqlSessionFactoryBuilder().build(inputStream);
//2. ��ȡSqlSession����������ִ��sql
    SqlSession sqlSession = sqlSessionFactory.openSession();
//3. ִ��sql
//    List<User> users = sqlSession.selectList(
//        "com.itheima.mapper.UserMapper.selectAll"); //������һ���ַ��������ַ���������ӳ�������ļ���namespace.id
//    System.out.println(users);

    List<User> users = sqlSession.selectList(
        "com.itheima.mapper.UserMapper.selectAll"); //������һ���ַ��������ַ���������ӳ�������ļ���namespace.id
    System.out.println(users);

    for(User u : users) {
      System.out.println(u);
    }
//4. �ͷ���Դ
    sqlSession.close();
  }
}

