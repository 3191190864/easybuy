package com.buy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2019/11/14 14:51
 * @Modified By:
 */

//工具类（添加删除，修改查询的）
public class BaseDao {
   private String driver="com.mysql.jdbc.Driver";
    //本机数据库地址
    private String url="jdbc:mysql://localhost:3306/meetroom?useSSL=false";
    //存储用户名和密码
    private String userName="root";
    private String pwd="1234";
    Connection conn=null;//连接
    PreparedStatement pstmt=null;//执行对象
    ResultSet rs=null;//结果集

    public Connection getConnection(){
        try{
           //加载驱动
           Class.forName(driver);
           //2.连接
            conn= DriverManager.getConnection(url,userName,pwd);

        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    //查询
    //Object数组  ...param表示数组名
    public ResultSet getExecuteQuery(String sql,Object...param){
        try{
            //驱动，连接
            conn=getConnection();
            pstmt=conn.prepareStatement(sql);
            //判断数组是否右值，来判断有没有问号
            if(param!=null&&param.length>0){
                for (int i=0;i<param.length;i++){
                    //给sql语句中的？占位符设置值
                    pstmt.setObject((i+1),param[i]);
                }
            }
            //返回执行对象,返回结果集

            rs=pstmt.executeQuery();

        }catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    //修改
    public int getExecuteUPdate(String sql,Object...param){
        try{
            conn=getConnection();//创建连接
            //创建执行对象
            pstmt=conn.prepareStatement(sql);
            //给？设置参数
            if(param!=null&& param.length>0){
                for (int i=0;i<param.length;i++){
                    pstmt.setObject((i+1),param[i]);
                }
            }
            return  pstmt.executeUpdate();

        }

        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            //关闭
            closeAll();
        }
        return -1;
    }

    //关闭所有
    public void closeAll(){
        try{
            if (rs!=null){
                rs.close();
            }
            if (pstmt!=null){
                pstmt.close();
            }
            if (conn!=null){
                conn.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}


