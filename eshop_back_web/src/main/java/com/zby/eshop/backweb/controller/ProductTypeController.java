package com.zby.eshop.backweb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zby.common.constant.PageConstant;
import com.zby.common.constant.ProductTypeStatusConstant;
import com.zby.common.constant.ResponseStatusConstant;
import com.zby.common.exception.ProductTypeException;
import com.zby.common.utils.ResponseResult;
import com.zby.entity.ProductTypePO;
import com.zby.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhangbyi
 * @date 10:33 2018/12/7
 */
@Controller
@RequestMapping("backweb/productType")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping("findAll")
    public String findAll(Model model,Integer pageNum){
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum = PageConstant.PAGE_NUM;
        }
        PageHelper.startPage(pageNum,PageConstant.PAGE_SIZE);
        List<ProductTypePO> productTypePOList = productTypeService.findAll();
        PageInfo<ProductTypePO> pageInfo = new PageInfo<>(productTypePOList);
        model.addAttribute("pageInfo",pageInfo);
        return "productTypeManager";
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult add(@RequestParam("name") String name){
        ResponseResult responseResult = new ResponseResult();
        try {
            productTypeService.insert(name, ProductTypeStatusConstant.PRODUCT_TYPE_ENABLE);
            responseResult.setStatus(ResponseStatusConstant.SUCCESS);
            responseResult.setMessage("添加成功！");
        } catch (ProductTypeException e) {
//            e.printStackTrace();
            responseResult.setStatus(ResponseStatusConstant.FAILED);
            responseResult.setMessage(e.getMessage());
        }
        return responseResult;
    }
}
