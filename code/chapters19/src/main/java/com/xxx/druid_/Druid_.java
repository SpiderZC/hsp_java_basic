package com.xxx.druid_;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class Druid_ {
    public static void main(String[] args) {
        test01();
    }

    public static void test01() {
        Properties properties = new Properties();
        Connection connection = null;
        try {
            properties.load(new FileInputStream("src/main/resources/druid.properties"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            connection = dataSource.getConnection();
            System.out.println(connection + "得到");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
