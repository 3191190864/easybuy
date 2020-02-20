package com.buy.dao.IProduct.impl;

import com.buy.dao.IProduct.productCategory;
import com.buy.entity.easybuyProductCategory;
import com.buy.utils.dataSourceUtill;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/19 15:57
 * @Modified By:
 */
public class ProductCategoryImpl implements productCategory {
    @Override
    public List<easybuyProductCategory> queryAllProductCategory(String parentID) {
        List<easybuyProductCategory>productCategories=new ArrayList<easybuyProductCategory>();
        easybuyProductCategory productCategory=null;
        try{
            StringBuffer sql=new StringBuffer();
            sql.append("select * from easybuy_product_category where 1=1 and parentId=0");
            //判断id 如果为0 现实的是一级分类
            if ((!"".equals(parentID)||null!=parentID)){
                sql.append(" and parentId = ?");
            }
            Connection connection= dataSourceUtill.getConn();
            PreparedStatement pstmt= connection.prepareStatement(sql.toString());
            if (!"".equals(parentID) && null != parentID) {
                pstmt.setObject(1, parentID);
            }
            ResultSet rs=pstmt.executeQuery();

            //处理接受结果
            while (rs.next()){
                productCategory=new easybuyProductCategory();
                productCategory.setId(rs.getInt(1));
                productCategory.setName(rs.getString(2));
                productCategory.setParentId(rs.getInt(3));
                productCategory.setType(rs.getInt(4));
                productCategory.setIconClass(rs.getString(5));
                //讲对象填充到集合
                productCategories.add(productCategory);
            }
            return productCategories;

        }catch (Exception e){
            e.printStackTrace();
        }


        return productCategories;
    }
}
