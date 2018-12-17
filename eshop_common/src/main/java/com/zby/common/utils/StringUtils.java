package com.zby.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author zhangbyi
 * @date 16:05 2018/12/11
 */
public class StringUtils {

    public static String rename(String name){
        int index = name.lastIndexOf(".");
        String suffix = name.substring(index);
        return new SimpleDateFormat("yyyyMMddHHmmSS").format(new Date())+new Random().nextInt(100)+suffix;
    }
}
