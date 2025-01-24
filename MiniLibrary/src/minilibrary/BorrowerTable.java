/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minilibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author wardi
 */
public class BorrowerTable {
    
    private static final String URL = "jdbc:mysql://localhost:3306/mini_library_system"; // Update with your database URL
    private static final String USER = "root"; // Update with your database username
    private static final String PASSWORD = "Ws@542004"; // Update with your database password
    
    /**
     *
     * @param borrower
     * @throws SQLException
     */
    public void AddNewBorrower(Borrower borrower) throws SQLException {
        String insertBORROWERSQL = "INSERT INTO borrowers (number_ID, borrower_name, borrowedBooks) VALUES (?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(insertBORROWERSQL)) {
            preparedStatement.setInt(1, borrower.getNumberIDBorrower());
            preparedStatement.setString(2, borrower.getBorrowerName());
            preparedStatement.setString(3, borrower.getBorrowedBooks());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            throw e;
        }
    }
    
}
