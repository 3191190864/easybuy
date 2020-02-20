package com.buy.servlet;

import com.buy.entity.easybuyProductCategory;
import com.buy.service.product.IProductCategoryService;
import com.buy.service.product.IProductCategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/20 11:17
 * @Modified By:
 */
@WebServlet(name="HomeServlet",urlPatterns = {"/home"})
public class HomeSevelt extends HttpServlet {
    IProductCategoryService productCategoryService=new IProductCategoryServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IProductCategoryService productCategoryService = new IProductCategoryServiceImpl();
        List<easybuyProductCategory> categoryList = productCategoryService.queryAllProductCategory("0");

        //存储数据
        request.setAttribute("categoryList",categoryList);

        //携带数据跳转到home.jsp
        request.getRequestDispatcher("/front/home.jsp").forward(request,response);
    }
}
