package com.offcn.utils;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Utils {
    private static DataSource ds;

    public static DataSource getDataSource(){
        Properties properties =new Properties();
        InputStream resourceAsStream = Utils.class.getResourceAsStream("/druid.properties");
        try {
            properties.load(resourceAsStream);
            ds= DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn= ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void close(Connection conn, Statement st, ResultSet rs){
        if (conn !=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st !=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs !=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
