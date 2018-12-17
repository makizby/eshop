package com.zby.dao;

import com.zby.entity.product.ProductPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author zhangbyi
 * @date 14:54 2018/12/11
 */
@Mapper
@Component
public interface ProductMapper {
    void insert(ProductPO productPO);
}
