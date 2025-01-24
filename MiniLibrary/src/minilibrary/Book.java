/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minilibrary;

import java.util.Calendar;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author wardi
 */
public class Book {

    private int number_id;
    private String book_title;
    private String author;
    private String category;
    private boolean isAvailable;
    private LocalDateTime dateBorrowed;
    private double dailyFee;
    private double lateFee;

    public Book(int number_id, String book_title, String author, String category, double dailyFee, double lateFee) {
        this.number_id = number_id;
        this.book_title = book_title;
        this.author = author;
        this.category = category;
        this.isAvailable = true;
        this.dailyFee = dailyFee;
        this.lateFee = lateFee;
        this.dateBorrowed = null;
    }

    public int getNumberID() {
        return number_id;
    }

    public String getBookTitle() {
        return book_title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public double getDailyFee() {
        return dailyFee;
    }
    
    public void setNumberID(int number_id) {
        this.number_id = number_id;
    }

    public void setBookTitle(String book_title) {
        this.book_title = book_title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void borrowBook(String date) {
        isAvailable = false;
        dateBorrowed = stringToLDT(date);
    }
    
    public double returnBook(String date) {
        isAvailable = true;
        dateBorrowed = null;
        return getTotal(stringToLDT(date));
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }
    
    private double getTotal(LocalDateTime date) {
        long days = Duration.between(dateBorrowed, date).toDays();
        if (days > 7) {
            return (dailyFee * 7) + ((days - 7) * lateFee);
        } else {
            return dailyFee * days;
        }
    }
    
    private LocalDateTime stringToLDT(String date) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDateTime.parse(date, dtf);
    }

}
