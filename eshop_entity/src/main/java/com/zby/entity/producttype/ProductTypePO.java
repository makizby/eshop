package com.zby.entity.producttype;

import java.io.Serializable;

/**
 * @author zhangbyi
 * @date 15:28 2018/12/7
 */
public class ProductTypePO implements Serializable {

    private static final long serialVersionUID = 6664895218815423490L;

    private int id;

    private String name;

    private int status;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
