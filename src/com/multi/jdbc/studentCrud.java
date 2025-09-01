package com.multi.jdbc;


import java.sql.*;
import java.util.Scanner;

public class studentCrud {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/spring";
    private static final String DB_USER = "apple";
    private static final String DB_PASSWORD = "apple";

    private static void addStudent(Scanner scanner) {
        System.out.println("학생 정보 추가");
        System.out.println("이름 : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("전공: ");
        String major = scanner.nextLine();

        String query = "INSERT INTO student(name,age,major) values(?,?,?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, major);
            int rows = pstmt.executeUpdate();

            System.out.println(rows + " 학생 추가됨.");


        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    private static void viewStudent(Scanner scanner) {
        System.out.println("학생 조회");
        String query = "SELECT * FROM student";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("\nID | NAME | AGE | MAJOR");
            System.out.println("---------------------------");
            while (rs.next()) { // 결과 집합에서 다음 행으로 이동
                int id = rs.getInt("id"); // id 열 값 가져오기
                String name = rs.getString("name"); // name 열 값 가져오기
                int age = rs.getInt("age"); // age 열 값 가져오기
                String major = rs.getString("major"); // major 열 값 가져오기
                System.out.printf("%d | %s | %d | %s%n", id, name, age, major); // 형식화된 결과 출력
            }
        } catch (SQLException e) {
            e.printStackTrace(); // SQL 예외 발생 시 스택 트레이스 출력
        }
    }

    private static void updateStudent(Scanner scanner) {
        System.out.println("수정할 학생 id 입력");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("새 이름 입력");
        String name = scanner.nextLine();
        System.out.println("새 나이 입력");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("새 전공 입력");
        String major = scanner.nextLine();

        String query = "UPDATE student SET name=?, age=?,major=? where id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, major);
            pstmt.setInt(4, id);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " 학생 정보 수정 완료");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.println("삭제할 학생 id 입력");
        int id = scanner.nextInt();
        scanner.nextLine();

        String query = "DELETE FROM student WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + "학생 삭제 완료.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("==== Student Crud Menu ====");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addStudent(scanner); // 학생 추가 기능 호출
                        break;
                    case 2:
                        viewStudent(scanner); // 학생 조회 기능 호출
                        break;
                    case 3:
                        updateStudent(scanner); // 학생 수정 기능 호출
                        break;
                    case 4:
                        deleteStudent(scanner); // 학생 삭제 기능 호출
                        break;
                    case 5:
                        System.out.println("Exiting..."); // 종료 메시지 출력
                        return; // 프로그램 종료
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}

