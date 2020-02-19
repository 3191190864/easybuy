package com.buy.test;

import com.buy.dao.IProduct.impl.ProductCategoryImpl;
import com.buy.dao.IProduct.productCategory;
import com.buy.entity.easybuyProductCategory;
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
        productCategory p=new ProductCategoryImpl();
       List<easybuyProductCategory> sv= p.queryAllProductCategory("0");
        for (easybuyProductCategory category : sv) {
            System.out.println(category.getName());

        }
    }
}
