package com.zby.common.exception;

/**
 * @author zhangbyi
 * @date 9:50 2018/12/8
 * 商品类型异常
 */
public class ProductTypeException extends Exception{

    public ProductTypeException() {
        super();
    }

    public ProductTypeException(String message) {
        super(message);
    }

    public ProductTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductTypeException(Throwable cause) {
        super(cause);
    }

    protected ProductTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
