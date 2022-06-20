package com.itheima.test;

import com.itheima.mapper.Brand;
import com.itheima.mapper.UserMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTest {

  public static void main(String[] args) throws IOException {
    int id = 1;
//1. ����mybatis�ĺ��������ļ�����ȡ SqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//2. ��ȡSqlSession����������ִ��sql
    SqlSession sqlSession = sqlSessionFactory.openSession();
//3. ִ��sql
//3.1 ��ȡUserMapper�ӿڵĴ������
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//    List<Brand> users = userMapper.selectall();
//    for (Brand b : users) {
//      System.out.println(b);
//    }
//    Brand brands = userMapper.selectById(id);
//    System.out.println(brands);
//    Integer num = 10;
//    List<Brand> brand01 = userMapper.selectByOrder(num);
//    System.out.println(brand01);
    //���ղ���
    int status = 1;
    String companyName = "��Ϊ";
    String brandName = "��Ϊ";
    // �������
    companyName = "%" + companyName + "%";
    brandName = "%" + brandName + "%";

    List<Brand> brands = userMapper.selectByCondition(status, companyName, brandName);
    System.out.println(brands);

    Brand brand = new Brand();
    brand.setStatus(status);
    brand.setBrandName(brandName);
    brand.setCompanyName(companyName);
    List<Brand> brands01 = userMapper.selectByCondition01(brand);
    System.out.println(brands01);

    HashMap brand02 = new HashMap();
    brand02.put("status", status);
    brand02.put("brandName", brandName);
    brand02.put("companyName", companyName);

    List<Brand> brands1 = userMapper.selectByCodition02(brand02);
    System.out.println(brands1 + "mapper");

    List<Brand> brands2 = userMapper.selectByConditionSingle(brand);

    System.out.println(brands2 + "brands2");

    status = 1;
    companyName = "�����ֻ�";
    brandName = "����";
    String description = "�ֻ��е�ս����";
    int ordered = 200;
    id = 8;

    Brand brand01 = new Brand();
    brand01.setStatus(status);
    brand01.setCompanyName(companyName);
    brand01.setBrandName(brandName);
    brand01.setDescription(description);
    brand01.setOrdered(ordered);
    brand01.setId(id);

//    userMapper.addBrand(brand01);
//    System.out.println(brand01.getId());
//    sqlSession.commit();

//    userMapper.update(brand01);
//    userMapper.deleteById(id);
//    sqlSession.commit();
    int[] ids = {9, 10, 11};
    userMapper.deleteByIds(ids);
    sqlSession.commit();

//4. �ͷ���Դ
    sqlSession.close();

  }
}
