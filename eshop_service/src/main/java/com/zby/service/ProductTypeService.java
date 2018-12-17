package com.zby.service;

import com.zby.common.exception.ProductTypeException;
import com.zby.entity.producttype.ProductTypePO;

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
    void insert(String name,int status) throws ProductTypeException;

    ProductTypePO findById(int id);

    void update (int id,String name) throws ProductTypeException;

    void delete (int id);

    void changeStatus(int id);

    List<ProductTypePO> findAllEnable();


}
