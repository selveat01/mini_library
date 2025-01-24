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
public class BookTable {
    
    private static final String URL = "jdbc:mysql://localhost:3306/mini_library_system"; // Update with your database URL
    private static final String USER = "root"; // Update with your database username
    private static final String PASSWORD = "Ws@542004"; // Update with your database password
    
    public void AddNewBookDetails(Book book) throws SQLException {
        String insertBOOKSQL = "INSERT INTO book (book_id, book_title, author, category, isAvailable, dailyFee) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connect2 = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connect2.prepareStatement(insertBOOKSQL)) {
            preparedStatement.setInt(1, book.getNumberID());
            preparedStatement.setString(2, book.getBookTitle());
            preparedStatement.setString(3, book.getAuthor());
            preparedStatement.setString(4, book.getCategory());
            preparedStatement.setBoolean(5, book.getIsAvailable());
            preparedStatement.setDouble(6, book.getDailyFee());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            throw e;
        }
    }
    
}
