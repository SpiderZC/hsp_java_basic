package com.xxx;

import com.mysql.cj.jdbc.Driver;
import org.junit.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcConn {
    @Test
    public void connect01() {
        System.out.println("connect01");
        String url = "jdbc:mysql://localhost:3306/test01?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
        Connection connect = null;
        try {
            Driver driver = new Driver();
            Properties properties = new Properties();
            properties.setProperty("user", "root");
            properties.setProperty("password", "1qaz@WSX");
            connect = driver.connect(url, properties);
            System.out.println(connect);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connect.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void connect02() {
        Connection connection = null;
        try {
            Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
            Driver driver = (Driver) aClass.newInstance();
            String url = "jdbc:mysql://localhost:3306/test01?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
            Properties info = new Properties();
            info.setProperty("user", "root");
            info.setProperty("password", "1qaz@WSX");
            connection = driver.connect(url, info);
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void connect03() {
        Connection connection = null;
        try {
            Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
            Driver driver = (Driver) aClass.newInstance();
            String url = "jdbc:mysql://localhost:3306/test01?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
            String user = "root";
            String password = "1qaz@WSX";
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(url, user, password);
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void connect04() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test01?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
            String user = "root";
            String password = "1qaz@WSX";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void connect05() {
        Connection connection = null;
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/main/resources/jdbc.properties"));
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driver = properties.getProperty("driver");
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
