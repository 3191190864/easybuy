package com.buy.service.product;

import com.buy.entity.easybuyProductCategory;

import java.util.List;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/20 11:03
 * @Modified By:
 */
public interface IProductCategoryService {
    List<easybuyProductCategory> queryAllProductCategory(String parentId);
}
