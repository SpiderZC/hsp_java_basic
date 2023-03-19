package com.xxx.druid_;

import com.xxx.utils.DruidUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class DruidUtilsTest {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DruidUtils.getConnection();
            System.out.println(connection + "得到");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DruidUtils.close(null,null,connection);
        }
    }
}
