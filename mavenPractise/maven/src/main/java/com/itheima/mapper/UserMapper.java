package com.itheima.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

  List<User> selectAll();

  List<Brand> selectall();

  /**
   * 查看详情：根据Id查询
   */
  Brand selectById(int id);

  List<Brand> selectByOrder(Integer num);

  List<Brand> selectByCondition(@Param("status") int status,
      @Param("companyName") String companyName, @Param("brandName") String brandName);

  List<Brand> selectByCondition01(Brand brand);

  List<Brand> selectByCodition02(Map brand);

  List<Brand> selectByConditionSingle(Brand brand);

  void addBrand(Brand brand);

  void update(Brand brand);

  void deleteById(int id);

  void deleteByIds(int[] ids);


}
