package com.buy.utils;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/19 10:59
 * @Modified By:
 */
public class dataSourceUtill {
    /*
    * 配置阿里巴巴数据源
    * */
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String url="jdbc:mysql://localhost:3306/easybuy";
    private static final String userName="root";
    private static final String pwd="1234";
    private static Connection conn=null;
    //配置druid数据源对象
    private static DruidDataSource druidDataSource=null;

   static {
       try{

         init();
       }catch (SQLException e){
           e.printStackTrace();
       }
   }
    //连接数据源方法返回@return对象
    public  static void init() throws SQLException {
        //实例化 DruidDataSource对象
        druidDataSource =new DruidDataSource();
        //设置属性的值
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        //设置连接池相关属性
        druidDataSource.setInitialSize(5);//设置初始化连接池数量
        druidDataSource.setMaxActive(100);//最大连接数
        druidDataSource.setMinIdle(1);//最空闲浇连接数
        druidDataSource.setMaxWait(1000);//连接等待时长，单位毫秒
        druidDataSource.setFilters("stat");//设置监控
    }
    public  static Connection getConn(){

        //加载mysql驱动
        try{
            Class.forName(driver);

            //如果数据库没有处于连接状态，那就创建一个连接
            if(conn==null){
                conn=druidDataSource.getConnection(userName,pwd);
                System.out.println("数据库已连接成功");
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.getErrorCode();
        }
        return conn;
    }
    //数据库关闭的方法
    public static void closeConnect(){
       if (conn!=null){
           try{
               conn.close();
           }catch (Exception e){
               e.printStackTrace();
           }
       }
    }
}
