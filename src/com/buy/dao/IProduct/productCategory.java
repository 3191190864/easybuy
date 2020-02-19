package com.buy.dao.IProduct;

import com.buy.entity.easybuyProductCategory;

import java.util.List;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/19 15:54
 * @Modified By:
 */
public interface productCategory {
    //获取商品的一级分类
    List<easybuyProductCategory>queryAllProductCategory(String parentId);
}
