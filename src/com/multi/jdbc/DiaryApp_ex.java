package com.multi.jdbc;

import java.sql.*;
import java.util.Scanner;

public class DiaryApp_ex {
    private static final String DB_url = "jdbc:mysql://localhost:3306/spring";
    private  static final String DB_user="apple";
    private static final String DB_password="apple";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n=== 일기장 프로그램 ===");
                System.out.println("1. 일기 추가");
                System.out.println("2. 일기 조회");
                System.out.println("3. 일기 수정");
                System.out.println("4. 일기 삭제");
                System.out.println("5. 종료");
                System.out.print("선택: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // 버퍼 비우기

                switch (choice) {
                    case 1:
                        createDiary(scanner);
                        break;
                    case 2:
                        readDiary();
                        break;
                    case 3:
                        updateDiary(scanner);
                        break;
                    case 4:
                        deleteDiary(scanner);
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    default:
                        System.out.println("올바른 선택이 아닙니다.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //1. 일기추가
    private static void createDiary(Scanner scanner){
        System.out.println("제목: ");
        String title = scanner.nextLine();
        System.out.println("내용: ");
        String content = scanner.nextLine();

        String query = "INSERT INTO diary (title,content) VALUES (?,?)";
        try(Connection conn= DriverManager.getConnection(DB_url,DB_user,DB_password);
            PreparedStatement pstmt=conn.prepareStatement(query)){
            pstmt.setString(1,title);
            pstmt.setString(2,content);
            int rows = pstmt.executeUpdate();
            System.out.println(rows+"개의 일기가 추가되었습니다");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    // 2. 일기조회
    private static void readDiary(){
        String query = "SELECT * from diary order by created_at desc";
        try(Connection conn=DriverManager.getConnection(DB_url,DB_user,DB_password);

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {

            System.out.println("\n==== 저장된 일기 ====");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String content = resultSet.getString("content");
                Timestamp createdAt = resultSet.getTimestamp("created_at");
                System.out.println("ID: "+id);
                System.out.println("제목: "+title);
                System.out.println("내용: "+content);
                System.out.println("작성일: "+createdAt);
                System.out.println("-------------------------");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    private static void updateDiary(Scanner scanner){
        System.out.println("수정할 일기 ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("새 제목: ");
        String newTitle = scanner.nextLine();
        System.out.println("새 내용: ");
        String newContent = scanner.nextLine();

        String query = "UPDATE diary SET title=?,content=? WHERE id=?";
        try(Connection conn=DriverManager.getConnection(DB_url,DB_user,DB_password);

        PreparedStatement statement=conn.prepareStatement(query)){

            statement.setString(1,newTitle);
            statement.setString(2,newContent);
            statement.setInt(3,id);
            int rows= statement.executeUpdate();
            System.out.println(rows+"개의 일기가 수정되었습니다.");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private static void deleteDiary(Scanner scanner){
        System.out.println("삭제할 일기 ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String query = "DELETE FROM diary WHERE id=?";
        try(Connection conn=DriverManager.getConnection(DB_url,DB_user,DB_password);
        PreparedStatement statement=conn.prepareStatement(query)){

            statement.setInt(1,id);
            int rows=statement.executeUpdate();
            System.out.println(rows+"개의 일기가 삭제되었습니다.");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}


