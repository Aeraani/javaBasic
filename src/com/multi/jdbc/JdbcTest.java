package com.multi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcTest {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spring";
        String user = "apple";
        String password = "apple";
        try {
            // Driver를 가져오는 부분
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 연결객체 (java+Database)
            Connection con = DriverManager.getConnection(url, user, password);

            // SQL 실행
            // Statement = 운반객체
            Statement stmt = con.createStatement();
            //rs = 결과집합
            ResultSet rs = stmt.executeQuery("SELECT empno,ename FROM emp");
            while (rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2));
            }
            //close 메모리에 있던 결과집합 지워짐
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


