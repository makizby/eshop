package com.zby.eshop.backweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangbyi
 * @date 9:52 2018/12/7
 */
@Controller
@RequestMapping("backweb/sys")
public class BackWebController {

    @RequestMapping("login")
    public String login(){
        //todo 用户信息校验
        return "main";
    }
}
