package com.xxx.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class JDBCUtils_Use {
    public static void main(String[] args) {
        JDBCUtils_Use jdbcUtilsUse = new JDBCUtils_Use();
        jdbcUtilsUse.testSelect();
    }

    public void testSelect() {
        Connection connection = JDBCUtils.getConnection();
        String sql = "select id, name, sex, borndate, phone from actor";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                Date date = resultSet.getDate(4);
                String phone = resultSet.getString(5);
                System.out.println(id + "\t" + name + "\t" + sex + "\t" + date + "\t" + phone);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(resultSet, preparedStatement, connection);
        }
    }

    public void testDML() {
        Connection connection = JDBCUtils.getConnection();
        String sql = "update actor set name = ? where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Spider");
            preparedStatement.setString(2, "1");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
