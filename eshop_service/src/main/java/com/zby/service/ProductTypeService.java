package com.zby.service;

import com.zby.common.exception.ProductTypeException;
import com.zby.entity.ProductTypePO;

import java.util.List;

/**
 * @author zhangbyi
 * @date 15:40 2018/12/7
 */
public interface ProductTypeService {

    /**
     * 返回所有商品类型
     * @return
     */
    List<ProductTypePO> findAll();

    /**
     * 添加商品类型
     * @param name
     */
    public void insert(String name,int status) throws ProductTypeException;
}
