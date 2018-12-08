package com.zby.common.utils;

import java.io.Serializable;

/**
 * @author zhangbyi
 * @date 10:04 2018/12/8
 */
public class ResponseResult implements Serializable {

    private static final long serialVersionUID = -7469779839034903907L;

    //响应码
    private int status;

    //响应信息
    private String message;

    //返回数据
    private Object data;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
