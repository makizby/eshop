package com.zby.dao;

import com.zby.entity.ProductTypePO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhangbyi
 * @date 15:26 2018/12/7
 */
@Mapper
@Component
public interface ProductTypeMapper {

    List<ProductTypePO> findAll();

    ProductTypePO selectByName(String name);

    ProductTypePO selectById(int id);

    int insert(@Param("name") String name,@Param("status") int status);

    int updateName(@Param("id") int id,@Param("name") String name);

    int updateStatus(@Param("id")int id,@Param("status")int status);

    int deleteById(int id);
}
