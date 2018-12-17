package com.zby.service;

import com.zby.service.dto.ProductDto;
import org.apache.commons.fileupload.FileUploadException;

/**
 * @author zhangbyi
 * @date 20:53 2018/12/10
 */
public interface ProductService {

    void add(ProductDto productDto) throws FileUploadException;
}
