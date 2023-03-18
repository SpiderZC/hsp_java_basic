package com.xxx.statement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

public class Statement_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter admin name");
        String admin_name = sc.nextLine();
        System.out.println("please enter admin password");
        String admin_pwd = sc.nextLine();
        Properties properties = new Properties();
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            properties.load(new FileInputStream("src/main/resources/jdbc.properties"));
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driver = properties.getProperty("driver");
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            String sql = "select name, pwd from admin where name = '" + admin_name + "' and pwd = '" + admin_pwd + "';";
            resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                System.out.println("login success");
            } else {
                System.out.println("login fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
