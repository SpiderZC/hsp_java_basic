package com.xxx.batch_;

import com.xxx.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch_ {
    public static void main(String[] args) {
        Batch_ batch = new Batch_();
        batch.useBatch();
    }

    public void useBatch() {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin(`name`, pwd) values (?,?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            long l = System.currentTimeMillis();
            for (int i = 0; i < 5000; i++) {
                preparedStatement.setString(1,"root" + i);
                preparedStatement.setString(2,"" + i);
                preparedStatement.addBatch();
                if (i % 1000 == 0) {
                    preparedStatement.executeBatch();
                    preparedStatement.clearBatch();
                }
            }
            long l1 = System.currentTimeMillis();
            System.out.println(l1 - l);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
