package com.zby.eshop.backweb.vo;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.Serializable;

/**
 * @author zhangbyi
 * @date 10:48 2018/12/11
 */
public class ProductVO {

    private String name;

    private Double price;

    private CommonsMultipartFile file;

    private Integer productTypeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CommonsMultipartFile getFile() {
        return file;
    }

    public void setFile(CommonsMultipartFile file) {
        this.file = file;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }
}
