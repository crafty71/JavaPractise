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
//1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new
        SqlSessionFactoryBuilder().build(inputStream);
//2. 获取SqlSession对象，用它来执行sql
    SqlSession sqlSession = sqlSessionFactory.openSession();
//3. 执行sql
//    List<User> users = sqlSession.selectList(
//        "com.itheima.mapper.UserMapper.selectAll"); //参数是一个字符串，该字符串必须是映射配置文件的namespace.id
//    System.out.println(users);

    List<User> users = sqlSession.selectList(
        "com.itheima.mapper.UserMapper.selectAll"); //参数是一个字符串，该字符串必须是映射配置文件的namespace.id
    System.out.println(users);

    for(User u : users) {
      System.out.println(u);
    }
//4. 释放资源
    sqlSession.close();
  }
}

