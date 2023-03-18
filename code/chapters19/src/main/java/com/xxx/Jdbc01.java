package com.xxx;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hspdb?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
        Connection connect = null;
        Statement statement = null;
        try {
            Driver driver = new Driver();
            Properties properties = new Properties();
            properties.setProperty("user", "root");
            properties.setProperty("password", "1qaz@WSX");
            connect = driver.connect(url, properties);
            String sql = "insert into actor values(null, '刘德华', '男', '1970-11-11', '1234')";
            // String sql = "update actor set phone='15855507420' where id = '1'";
            statement = connect.createStatement();
            int rows = statement.executeUpdate(sql);
            System.out.println(rows > 0 ? "success" : "failure");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connect.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
