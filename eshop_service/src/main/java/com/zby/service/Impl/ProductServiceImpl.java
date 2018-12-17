package com.zby.service.Impl;

import com.zby.common.utils.StringUtils;
import com.zby.dao.ProductMapper;
import com.zby.entity.product.ProductPO;
import com.zby.entity.producttype.ProductTypePO;
import com.zby.service.ProductService;
import com.zby.service.dto.ProductDto;
import org.apache.commons.fileupload.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StreamUtils;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zhangbyi
 * @date 20:53 2018/12/10
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public void add(ProductDto productDto) throws FileUploadException {
       //1.文件存到服务器上
        String fileName = StringUtils.rename(productDto.getFileName());
        String filePath = productDto.getUploadPath()+"/"+fileName;
        try {
            StreamUtils.copy(productDto.getFileInputStream(),new FileOutputStream(filePath));
        } catch (IOException e) {
            throw new FileUploadException("文件上传失败"+e.getMessage());
        }
        // 2.数据存到数据库
        ProductPO productPO = new ProductPO();
        productPO.setName(productDto.getName());
        productPO.setPrice(productDto.getPrice());
        productPO.setImage(filePath);
        ProductTypePO productTypePO = new ProductTypePO();
        productTypePO.setId(productDto.getProductTypeId());
        productPO.setProductTypePO(productTypePO);
        productMapper.insert(productPO);
    }
}
