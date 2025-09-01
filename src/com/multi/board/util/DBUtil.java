package com.multi.board.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private final String driverName = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/board_db?serverTimezone=UTC";
    private final String user = "apple";
    private final String pass = "apple";

    private static DBUtil instance = new DBUtil();

    private DBUtil() {
        try {
            Class.forName(driverName);//MysqlDriver를 동적으로 로딩하는 부분...
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //DBUtil을 반환하는메소드
    public static DBUtil getInstance() {
        return instance;
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }
    public void close(AutoCloseable... closeables) {
        for (AutoCloseable c : closeables) {
            if (c != null) {
                try {
                    c.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


}