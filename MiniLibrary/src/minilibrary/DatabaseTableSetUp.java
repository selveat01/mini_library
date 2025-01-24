/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minilibrary;

import java.sql.*;

/**
 *
 * @author wardi
 */
public class DatabaseTableSetUp {

    private static final String URL = "jdbc:mysql://localhost:3306/mini_library_system";
    private static final String USER = "root";
    private static final String PASSWORD = "Ws@542004";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection conn = DatabaseTableSetUp.getConnection()) {
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}
