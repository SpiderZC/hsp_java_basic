package com.xxx.c3p0_;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class C3P0_ {
    public static void main(String[] args) {
        C3P0_ c3P0 = new C3P0_();
        c3P0.test01();
    }

    public void test01() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/jdbc.properties"));
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driver = properties.getProperty("driver");
            comboPooledDataSource.setDriverClass(driver);
            comboPooledDataSource.setUser(user);
            comboPooledDataSource.setPassword(password);
            comboPooledDataSource.setJdbcUrl(url);
            comboPooledDataSource.setInitialPoolSize(3);
            comboPooledDataSource.setMaxPoolSize(10);
            Connection connection = comboPooledDataSource.getConnection();
            System.out.println("get Connection" + connection);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test02() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("src/main/resources/c3p0-config.xml");
        Connection connection = null;
        try {
            connection = comboPooledDataSource.getConnection();
            System.out.println("get Connection" + connection);
        } catch (SQLException e) {
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
