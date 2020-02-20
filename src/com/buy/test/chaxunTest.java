package com.buy.test;

import com.buy.dao.IProduct.impl.ProductCategoryImpl;
import com.buy.dao.IProduct.productCategory;
import com.buy.entity.easybuyProductCategory;
import com.buy.service.product.IProductCategoryService;
import com.buy.service.product.IProductCategoryServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/19 16:21
 * @Modified By:
 */
public class chaxunTest {
    @Test
    public  void testProuctCategory(){
        IProductCategoryService p=new IProductCategoryServiceImpl();
       List<easybuyProductCategory> sv= p.queryAllProductCategory("0");
        for (easybuyProductCategory category : sv) {
            System.out.println(category.getName());

        }
    }
}
