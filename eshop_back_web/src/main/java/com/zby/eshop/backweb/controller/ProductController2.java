package com.zby.eshop.backweb.controller;

import com.zby.common.utils.ResponseResult;
import com.zby.eshop.backweb.vo.ProductVO;
import com.zby.entity.producttype.ProductTypePO;
import com.zby.service.ProductService;
import com.zby.service.ProductTypeService;
import com.zby.service.dto.ProductDto;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author zhangbyi
 * @date 9:53 2018/12/12
 */
@Controller
@RequestMapping("backweb/product/")
public class ProductController2 {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductTypeService productTypeService;

    @ModelAttribute("productTypes")
    public List<ProductTypePO> loadAllEnableProType(){
        return productTypeService.findAllEnable();
    }

    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public String findAll(){
        return "productManager";
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public ResponseResult addProduct(ProductVO productVO, HttpSession httpSession, Model model){

        String uploadPath = httpSession.getServletContext().getRealPath("/WEB-INF/upload");
        //VO转化Dto
        try {
            //工具类复制相同属性
            ProductDto productDto = new ProductDto();
            PropertyUtils.copyProperties(productDto,productVO);
            productDto.setFileInputStream(productVO.getFile().getInputStream());
            productDto.setFileName(productVO.getFile().getOriginalFilename());
            productDto.setUploadPath(uploadPath);
            productService.add(productDto);
            return ResponseResult.success("添加成功");
        } catch (Exception e) {
            return ResponseResult.failed(e.getMessage());
        }
    }
}
