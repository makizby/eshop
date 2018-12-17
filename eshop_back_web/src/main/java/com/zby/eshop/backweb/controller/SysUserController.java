package com.zby.eshop.backweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangbyi
 * @date 20:13 2018/12/11
 */
@Controller
@RequestMapping("backweb/sysuser/")
public class SysUserController {

    @RequestMapping("findAll")
    public String findAll(){
        return "sysuserManager";
    }
}
