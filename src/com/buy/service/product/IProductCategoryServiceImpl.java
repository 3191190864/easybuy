package com.buy.service.product;

import com.buy.dao.IProduct.impl.ProductCategoryImpl;
import com.buy.dao.IProduct.productCategory;
import com.buy.entity.easybuyProductCategory;

import java.util.List;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/20 11:06
 * @Modified By:
 */
public class IProductCategoryServiceImpl implements IProductCategoryService {
    private productCategory productCategory=new ProductCategoryImpl();
    @Override
    public List<easybuyProductCategory> queryAllProductCategory(String parentId) {
        parentId="0";
        return productCategory.queryAllProductCategory(parentId);
    }
}
