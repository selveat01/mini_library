/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minilibrary;

import java.util.ArrayList;

/**
 *
 * @author wardi
 */
public class Borrower {

    private int number_ID;
    private String borrower_name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(int number_ID, String borrower_name) {
        this.number_ID = number_ID;
        this.borrower_name = borrower_name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getNumberIDBorrower() {
        return number_ID;
    }

    public void setNumberIDBorrower(int number_ID) {
        this.number_ID = number_ID;
    }

    public String getBorrowerName() {
        return borrower_name;
    }

    public void setBorrowerName(String borrower_name) {
        this.borrower_name = borrower_name;
    }

    public String getBorrowedBooks() {
        String str = "";
        for (Book book:borrowedBooks) {
            str += book.getBookTitle() + "\n";
        }
        return str;
    }

    public boolean addBorrowedBooks(Book book) {
        if (borrowedBooks.size() >= 5) {
            return false;
        } else {
            borrowedBooks.add(book);
            return true;
        }
    }

    public boolean removeBorrowedBooks(Book book) {
        return borrowedBooks.remove(book);
    }
    
    public boolean removeBorrowedBooks(String title) {
        for (Book book:borrowedBooks) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                return borrowedBooks.remove(book);
            }
        }
        return false;
    }
}
