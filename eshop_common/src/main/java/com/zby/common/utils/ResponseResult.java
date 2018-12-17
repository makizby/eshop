package com.zby.common.utils;

import com.zby.common.constant.ResponseStatusConstant;

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

    public ResponseResult() {
    }

    public ResponseResult(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static ResponseResult success(Object data){
        return new ResponseResult(ResponseStatusConstant.SUCCESS,"success",data);
    }

    public static ResponseResult success(){
        return new ResponseResult(ResponseStatusConstant.SUCCESS,"success",null);
    }

    public static ResponseResult success(String message){
        return new ResponseResult(ResponseStatusConstant.SUCCESS,message,null);
    }

    public static ResponseResult failed(Object data){
        return new ResponseResult(ResponseStatusConstant.SUCCESS,"failed",data);
    }

    public static ResponseResult failed(String message){
        return new ResponseResult(ResponseStatusConstant.SUCCESS,message,null);
    }

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
