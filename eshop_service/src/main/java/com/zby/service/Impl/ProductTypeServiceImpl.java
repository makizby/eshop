package com.zby.service.Impl;

import com.zby.common.exception.ProductTypeException;
import com.zby.dao.ProductTypeMapper;
import com.zby.entity.ProductTypePO;
import com.zby.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhangbyi
 * @date 15:40 2018/12/7
 */
@Service
@Transactional
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductTypePO> findAll() {
        return productTypeMapper.findAll();
    }

    @Override
    public void insert(String name,int status) throws ProductTypeException {
        ProductTypePO productTypePO = productTypeMapper.selectByName(name);
        if(productTypePO != null){
            throw new ProductTypeException("已存在相关的商品类型！");
        }else {
            productTypeMapper.insert(name,status);
        }
    }
}
