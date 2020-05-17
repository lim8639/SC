package com.julien.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.util.JdbcUtils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC {
    Connection conn =null;
    private static DruidDataSource dataSource;
    static {
        try{
            Properties properties = new Properties();
            InputStream inputStream =  JdbcUtils.class.getClassLoader()
                    .getResourceAsStream("jdbc.properties");
            //从流中读取数据
            if(inputStream!=null)
                properties.load(inputStream);
            //创建数据库连接池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /*
        如果返回null ,说明连接失败
     */
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // 只要运行就会加载静态内部类，用于测试数据库连接
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
