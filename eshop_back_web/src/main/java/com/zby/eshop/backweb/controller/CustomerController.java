package com.zby.eshop.backweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangbyi
 * @date 20:50 2018/12/11
 */
@Controller
@RequestMapping("backweb/customer/")
public class CustomerController {

    @RequestMapping("findAll")
    public String findAll(){
        return "customerManager";
    }
}
